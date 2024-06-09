package pe.edu.cibertec.api_soap_pubs_examen.configuration;


import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;



@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet
            (ApplicationContext applicationContext){
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }
    @Bean(name = "medicos")
    public DefaultWsdl11Definition medicoWsdl11Definition(XsdSchema medicoSchema){
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("MedicosPort");
        wsdl11Definition.setLocationUri("/ws/medicos");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(medicoSchema);
        return wsdl11Definition;
    }
    @Bean
    public XsdSchema medicoSchema(){
        return new SimpleXsdSchema(new ClassPathResource("xsd/medico.xsd"));
    }




    @Bean(name = "numbers")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema numbersSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("NumbersPort");
        wsdl11Definition.setLocationUri("/ws/numbers");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/numbers");
        wsdl11Definition.setSchema(numbersSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema numbersSchema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/numero.xsd"));


    }





        // Math service WSDL definition
        @Bean(name = "cuadrado")
        public DefaultWsdl11Definition mathWsdl11Definition(XsdSchema mathSchema) {
            DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
            wsdl11Definition.setPortTypeName("MathPort");
            wsdl11Definition.setLocationUri("/ws/cuadrado");
            wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/cuadrado");
            wsdl11Definition.setSchema(mathSchema);
            return wsdl11Definition;
        }

    @Bean
     public XsdSchema mathSchema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/cuadrado.xsd"));
     }

    @Bean(name = "tiempo")
    public DefaultWsdl11Definition tiempoWsdl11Definition(XsdSchema tiempoSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("TiempoPort");
        wsdl11Definition.setLocationUri("/ws/tiempo");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/tiempo");
        wsdl11Definition.setSchema(tiempoSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema tiempoSchema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/tiempo.xsd"));
    }


    @Bean(name = "promedio")
    public DefaultWsdl11Definition practicaWsdl11Definition(XsdSchema practicaSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("PromedioPort");
        wsdl11Definition.setLocationUri("/ws/promedio");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/promedio");
        wsdl11Definition.setSchema(practicaSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema practicaSchema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/promedio.xsd"));
    }

    @Bean(name = "obrero")
    public DefaultWsdl11Definition obreroWsdl11Definition(XsdSchema obreroSchema){
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("ObreroPort");
        wsdl11Definition.setLocationUri("/ws/obrero");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/obrero");
        wsdl11Definition.setSchema(obreroSchema);
        return wsdl11Definition;
    }
    @Bean
    public XsdSchema obreroSchema(){
        return new SimpleXsdSchema(new ClassPathResource("xsd/obrero.xsd"));
    }



}
