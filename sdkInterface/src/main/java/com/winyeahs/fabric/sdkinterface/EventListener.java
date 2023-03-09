package com.winyeahs.fabric.sdkinterface;

import java.util.Map;

/**
 * @author chenyajun
 */
public interface EventListener {
    void received(Map<String, String> map);
}
