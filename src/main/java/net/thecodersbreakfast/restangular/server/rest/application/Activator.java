package net.thecodersbreakfast.restangular.server.rest.application;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
//import org.osgi.framework.ServiceReference;
//import org.osgi.service.http.HttpService;
//import org.restlet.Component;
//import org.restlet.ext.servlet.ServerServlet;

import java.awt.*;
import java.util.Hashtable;

public class Activator implements BundleActivator {

    //ServiceReference httpServiceRef;
    private RestangularComponent component;

    public void start(BundleContext context) throws Exception {
//      httpServiceRef = context.getServiceReference(HttpService.class.getName());
//      if(httpServiceRef != null) {
//        System.out.println("Adding /rest-example service");
//        HttpService service = (HttpService) context.getService(httpServiceRef);
//
//        Hashtable initParams = new Hashtable();
//        initParams.put("org.restlet.application","net.thecodersbreakfast.restangular.server.rest.application.RestangularApplication");
//
//        ServerServlet srv = new ServerServlet();
//
//        service.registerServlet("/boombox", srv, initParams, null);
//      }


        component = new RestangularComponent();
        component.start();
    }

    public void stop(BundleContext context) throws Exception {
        
//        if(httpServiceRef != null) {
//          HttpService service = (HttpService) context.getService(httpServiceRef);
//          service.unregister("/boombox");
//        }
//        httpServiceRef = null;
        component.stop();
    }

}
