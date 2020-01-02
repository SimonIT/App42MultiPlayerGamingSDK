package com.shephertz.app42.gaming.multiplayer.client.util;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.typedarrays.client.Uint8ArrayNative;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JsUtil {
	public static JavaScriptObject[] toJavaArray(JsArray<JavaScriptObject> jsArray) {
		JavaScriptObject[] array = new JavaScriptObject[jsArray.length()];
		for (int i = 0; i < jsArray.length(); i++) {
			array[i] = jsArray.get(i);
		}
		return array;
	}

	public static <T extends JavaScriptObject> List<T> toJavaList(JsArray<T> jsArrayString) {
		List<T> list = new ArrayList<>(jsArrayString.length());
		for (int i = 0; i < jsArrayString.length(); i++) {
			list.add(jsArrayString.get(i));
		}
		return list;
	}

	public static String[] toJavaStringArray(JsArrayString jsArrayString) {
		String[] strings = new String[jsArrayString.length()];
		for (int i = 0; i < jsArrayString.length(); i++) {
			strings[i] = jsArrayString.get(i);
		}
		return strings;
	}

	public static byte[] toJavaByteArray(Uint8ArrayNative uint8ArrayNative) {
		byte[] bytes = new byte[uint8ArrayNative.length()];
		for (int i = 0; i < uint8ArrayNative.length(); i++) {
			bytes[i] = (byte) uint8ArrayNative.get(i);
		}
		return bytes;
	}

	public static native JavaScriptObject toJsMap(Map<?, ?> map) /*-{
        var jsmap = {};
        var entries = map.@java.util.Map::entrySet()();
        var iterator = entries.@java.util.Set::iterator()();
        while (iterator.@java.util.Iterator::hasNext()()) {
            var entry = iterator.@java.util.Iterator::next()();
            jsmap[entry.@java.util.Map.Entry::getKey()()] = entry.@java.util.Map.Entry::getValue()();
        }
        return jsmap;
    }-*/;

	public static native Map<?, ?> toJavaMap(JavaScriptObject map) /*-{
        var jmap = @java.util.HashMap::new()();
        for (var entry of Object.entries(map)) {
            jmap.@java.util.HashMap::put(*)(entry[0], entry[1]);
        }
        return jmap;
    }-*/;
}