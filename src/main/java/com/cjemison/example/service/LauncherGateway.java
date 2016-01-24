package com.cjemison.example.service;

import java.util.concurrent.Future;

/**
 * Created by cjemison on 1/24/16.
 */
public interface LauncherGateway {

    Future<String> helloWorld(String name);
}
