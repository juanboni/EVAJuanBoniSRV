
package ec.edu.ups.pwp.EVABoniJuanCLI;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.5.0
 * 2022-02-01T12:02:10.435-05:00
 * Generated source version: 3.5.0
 *
 */
public final class AutomovilesServiceSOAP_AutomovilesServiceSOAPPort_Client {

    private static final QName SERVICE_NAME = new QName("http://bean.EVABoniJuanSRV.pwp.ups.edu.ec/", "AutomovilesServiceSOAPService");

    private AutomovilesServiceSOAP_AutomovilesServiceSOAPPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = AutomovilesServiceSOAPService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        AutomovilesServiceSOAPService ss = new AutomovilesServiceSOAPService(wsdlURL, SERVICE_NAME);
        AutomovilesServiceSOAP port = ss.getAutomovilesServiceSOAPPort();
        
        {
        System.out.println("Invoking getAutomoviles...");
        java.util.List<ec.edu.ups.pwp.EVABoniJuanCLI.Automovil> _getAutomoviles__return = port.getAutomoviles();
        System.out.println("getAutomoviles.result=" + _getAutomoviles__return);


        }
        
        /*
        {
        System.out.println("Invoking crearAutomovil...");
        ec.edu.ups.pwp.EVABoniJuanCLI.Automovil auto = null;
        auto=new Automovil();
        auto.setPlaca("ABI3434");
        auto.setPlaca("Toyota");
        auto.setModelo("YARIS");
        auto.setTipo("Camioneta");
        java.lang.String _crearAutomovil__return = port.crearAutomovil(auto);
        System.out.println("crearAutomovil.result=" + _crearAutomovil__return);


        }
        
		*/
        System.exit(0);
    }

}
