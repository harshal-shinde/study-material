# Context Loader
- Initialization work for root application context
- It looks for **context class** in web.xml if not found it loads default webApplicationContext
- For default, Need to implement **ConfigurableWebApplicationContext**
- Processes **contextConfigLocation** and passes its value to context instance
- We can provide multiple context files seperated by commas
- **WebApplicationInitializer** interface helps to configure servlet context programmatically 

The traditional, XML-based approach

```
  <servlet>
   <servlet-name>dispatcher</servlet-name>
   <servlet-class>
     org.springframework.web.servlet.DispatcherServlet
   </servlet-class>
   <init-param>
     <param-name>contextConfigLocation</param-name>
     <param-value>/WEB-INF/spring/dispatcher-config.xml</param-value>
   </init-param>
   <load-on-startup>1</load-on-startup>
 </servlet>

 <servlet-mapping>
   <servlet-name>dispatcher</servlet-name>
   <url-pattern>/</url-pattern>
 </servlet-mapping>
```

The code-based approach with WebApplicationInitializer

```
public class MyWebAppInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext container) {
      XmlWebApplicationContext appContext = new XmlWebApplicationContext();
      appContext.setConfigLocation("/WEB-INF/spring/dispatcher-config.xml");

      ServletRegistration.Dynamic dispatcher =
        container.addServlet("dispatcher", new DispatcherServlet(appContext));
      dispatcher.setLoadOnStartup(1);
      dispatcher.addMapping("/");
    }

 }
 ```