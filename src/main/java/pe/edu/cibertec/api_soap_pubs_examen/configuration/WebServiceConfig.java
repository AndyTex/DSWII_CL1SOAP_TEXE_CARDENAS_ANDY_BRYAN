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

}
