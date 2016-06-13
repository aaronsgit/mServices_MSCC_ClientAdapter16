package solutions.legatus.mservice.mscc.client.Request.impl;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.lang.reflect.*;
import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ahou on 2/18/2016.
 */
public class MsccBeanMapper<T> {

    private Class<T> clazz;

    public MsccBeanMapper() {

    }

    public MsccBeanMapper(Class<T> clazz ) {

        this.clazz = clazz;
    }



    public  List<T> toMsccBeanListFromResult(String raw, List<T> entity, Object entityObject ) {

        JsonParser parser = new JsonParser();

        if (parser != null) {

            JsonElement el = parser.parse( raw );

            if (!el.isJsonNull()) {

                JsonArray jsonElements = el.getAsJsonArray();

                if (jsonElements.isJsonArray() && jsonElements.size() > 0) {

                    Iterator<JsonElement> it = jsonElements.iterator();
                    while (it.hasNext()) {
                        JsonElement e = it.next();

                        JsonObject jsonObject = e.getAsJsonObject();

                        Class IDClass = null;
                        try {
                            IDClass =  Class.forName( entityObject.getClass().getName() );

                            Object o = IDClass.newInstance();
                            T t = (T)toMsccBeanFromResult(jsonObject.toString(), o );

                            entity.add( t );

                        } catch (ClassNotFoundException e1) {
                            e1.printStackTrace();
                        } catch (InstantiationException e1) {
                            e1.printStackTrace();
                        } catch (IllegalAccessException e1) {
                            e1.printStackTrace();
                        }

                    }
                }
            }
        }

        return entity;

    }




    public  Object toMsccBeanFromResult( String raw, Object entity ) {

        Class cls    = null;
        String fieldName = "";

        if( entity != null ) {
            try {
                cls = Class.forName( entity.getClass().getName() );

                Method m[] = cls.getDeclaredMethods();

                Field fieldlist[] = cls.getDeclaredFields();

                JsonParser parser = new JsonParser();
                if (parser != null) {

                    JsonElement el = parser.parse(raw);

                    if (!el.isJsonNull()) {

                        JsonObject jsonObject = el.getAsJsonObject();
                        //System.out.println(  "xxx"  + jsonObject );
                        if (jsonObject.isJsonObject()) {

                            for (int i = 0; i < m.length; i++)
                                if (m[i].getName().startsWith("set")) {

                                    fieldName = m[i].getName().substring( 3 );
                                    Field f = cls.getDeclaredField( fieldName );

                                    //System.out.println( "------------------>" + getType( (String)f.getType().getName() ) );

                                    if( !f.getType().isEnum() ) {

/* jdk 1.8 only    */
//                                        switch (getType((String) f.getType().getName())) {
//                                            case "ID":
//                                                Class IDClass = Class.forName(f.getType().getName());
//
//                                                Object o = IDClass.newInstance();
//
//                                                o = toMsccBeanFromResult(jsonObject.get("id").toString(), o);
//                                                m[i].invoke( entity, o );
//
//                                                break;
//                                            case "String":
//                                                m[i].invoke( entity, getNullAsEmptyString(jsonObject.get(toLowerFirstLetter(fieldName))));
//                                                break;
//                                            case "Integer":
//                                                m[i].invoke( entity, getNullAsEmptyInteger(jsonObject.get(toLowerFirstLetter(fieldName))));
//                                                break;
//                                            case "Timestamp":
//
//                                                JsonElement jsonElement = jsonObject.get(toLowerFirstLetter(fieldName));
//
////                                                System.out.println( jsonObject );
////                                                System.out.println( toLowerFirstLetter(fieldName) );
////                                                System.out.println( "[[[[[[[[[[[[[" + jsonElement );
//
//                                                if( jsonElement!= null &&  !jsonElement.isJsonNull() ) {
//                                                    Timestamp t = new Timestamp(jsonObject.get(toLowerFirstLetter(fieldName)).getAsLong());
//                                                    m[i].invoke( entity, t );
//                                                }
//                                            //case "Integer":
//
//                                        }
/*jdk 1.8 only  */


                                        String name = getType( (String) f.getType().getName() );
                                        if( name.equals( "ID" ) ) {
                                            Class IDClass = Class.forName(f.getType().getName());

                                            Object o = IDClass.newInstance();

                                            o = toMsccBeanFromResult(jsonObject.get("id").toString(), o);
                                            m[i].invoke( entity, o );

                                        } else if( name.equals( "String" ) ) {
                                            m[i].invoke( entity, getNullAsEmptyString(jsonObject.get(toLowerFirstLetter(fieldName))));
                                        } else if( name.equals( "Integer" ) ) {
                                            m[i].invoke( entity, getNullAsEmptyInteger(jsonObject.get(toLowerFirstLetter(fieldName))));
                                        } else if( name.equals( "Timestamp" ) ) {
                                            JsonElement jsonElement = jsonObject.get(toLowerFirstLetter(fieldName));

//                                                System.out.println( jsonObject );
//                                                System.out.println( toLowerFirstLetter(fieldName) );
//                                                System.out.println( "[[[[[[[[[[[[[" + jsonElement );

                                            if( jsonElement!= null &&  !jsonElement.isJsonNull() ) {
                                                Timestamp t = new Timestamp(jsonObject.get(toLowerFirstLetter(fieldName)).getAsLong());
                                                m[i].invoke( entity, t );
                                            }
                                        }

                                    } else { //handle enum
                                        //System.out.println( " string is enum?" + f.getType().isEnum() );
                                        String value = getNullAsEmptyString( jsonObject.get( toLowerFirstLetter( fieldName ) ) );
                                       // System.out.println( "value is" + Enum.valueOf( (Class<Enum>)f.getType(), value ));
                                        m[i].invoke( entity, Enum.valueOf( (Class<Enum>)f.getType(), value ) );

                                    }

                                }

                        }
                    }
                }

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }

        return  entity;

    }

    private  String getActualDataType( List<T> key ) {

        Class<?> clazz = key.getClass();


        ParameterizedType superclass = (ParameterizedType) clazz.getGenericSuperclass();


        Type[] types = superclass.getActualTypeArguments();


        Class<?> actualdataType = null;

        if( types != null && types.length > 0 && (types[0] instanceof Class<?>) ) {

            actualdataType = (Class<?>)types[0];
        }


        return actualdataType.getName();
    }


    private String toLowerFirstLetter(String str) {
        return  Character.toLowerCase( str.charAt(0)) + str.substring( 1 );
    }

    public String getNullAsEmptyString(JsonElement jsonElement) {
        if( jsonElement == null )       return null;

        return jsonElement.isJsonNull() ? "" : jsonElement.getAsString();
    }
    public static  Integer getNullAsEmptyInteger(JsonElement jsonElement) {
        return jsonElement.isJsonNull() ? null : jsonElement.getAsInt();
    }
    public static  Long getNullAsEmptyLong(JsonElement jsonElement) {
        return jsonElement.isJsonNull() ? null : jsonElement.getAsLong();
    }

    public  String getType( String type ) {

        if( type.contains( "ID") ) {
            return  "ID";
        }

        if( type.contains( "String") ) {
            return  "String";
        }
        if( type.contains( "Integer") ) {
            return  "Integer";
        }
        if( type.contains( "Timestamp") ) {
            return  "Timestamp";
        }
        if( type.contains( "List") ) {
            return  "List";
        }

        return "";

    }


    public static boolean isJSONValidObject( String JSON_STRING ) {
        boolean isObject = false;

        JsonParser parser = new JsonParser();

        if (parser != null) {

            JsonElement el = parser.parse(JSON_STRING);

            if (!el.isJsonNull()) {

                JsonObject jsonObject = null;
                try {
                    jsonObject = el.getAsJsonObject();
                    isObject = true;
                } catch (Exception ex) {
                }

            }

        }

        return isObject;

    }

    public static boolean isJSONValidArray( String JSON_STRING ) {

        boolean isArray = false;

        JsonParser parser = new JsonParser();

        if (parser != null) {

            JsonElement el = parser.parse(JSON_STRING);

            if (!el.isJsonNull()) {
                    try {
                        JsonArray jsonElements = el.getAsJsonArray();
                        isArray = true;
                    } catch ( Exception ex ) {

                    }
            }
        }

        return isArray;

    }



}
