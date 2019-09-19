
package service.business;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IUser", targetNamespace = "http://business.service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IUser {


    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "auth", targetNamespace = "http://business.service/", className = "service.business.Auth")
    @ResponseWrapper(localName = "authResponse", targetNamespace = "http://business.service/", className = "service.business.AuthResponse")
    @Action(input = "http://business.service/IUser/authRequest", output = "http://business.service/IUser/authResponse")
    public boolean auth(
        @WebParam(name = "arg0", targetNamespace = "")
        Admin arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns service.business.Client
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addClient", targetNamespace = "http://business.service/", className = "service.business.AddClient")
    @ResponseWrapper(localName = "addClientResponse", targetNamespace = "http://business.service/", className = "service.business.AddClientResponse")
    @Action(input = "http://business.service/IUser/addClientRequest", output = "http://business.service/IUser/addClientResponse")
    public Client addClient(
        @WebParam(name = "arg0", targetNamespace = "")
        Client arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns service.business.Client
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateClient", targetNamespace = "http://business.service/", className = "service.business.UpdateClient")
    @ResponseWrapper(localName = "updateClientResponse", targetNamespace = "http://business.service/", className = "service.business.UpdateClientResponse")
    @Action(input = "http://business.service/IUser/updateClientRequest", output = "http://business.service/IUser/updateClientResponse")
    public Client updateClient(
        @WebParam(name = "arg0", targetNamespace = "")
        Client arg0);

    /**
     * 
     * @return
     *     returns java.util.List<service.business.Client>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllClient", targetNamespace = "http://business.service/", className = "service.business.GetAllClient")
    @ResponseWrapper(localName = "getAllClientResponse", targetNamespace = "http://business.service/", className = "service.business.GetAllClientResponse")
    @Action(input = "http://business.service/IUser/getAllClientRequest", output = "http://business.service/IUser/getAllClientResponse")
    public List<Client> getAllClient();

    /**
     * 
     * @param arg0
     * @return
     *     returns service.business.Fournisseur
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addFournisseur", targetNamespace = "http://business.service/", className = "service.business.AddFournisseur")
    @ResponseWrapper(localName = "addFournisseurResponse", targetNamespace = "http://business.service/", className = "service.business.AddFournisseurResponse")
    @Action(input = "http://business.service/IUser/addFournisseurRequest", output = "http://business.service/IUser/addFournisseurResponse")
    public Fournisseur addFournisseur(
        @WebParam(name = "arg0", targetNamespace = "")
        Fournisseur arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteClient", targetNamespace = "http://business.service/", className = "service.business.DeleteClient")
    @ResponseWrapper(localName = "deleteClientResponse", targetNamespace = "http://business.service/", className = "service.business.DeleteClientResponse")
    @Action(input = "http://business.service/IUser/deleteClientRequest", output = "http://business.service/IUser/deleteClientResponse")
    public boolean deleteClient(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<service.business.Fournisseur>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getFournisseursByMc", targetNamespace = "http://business.service/", className = "service.business.GetFournisseursByMc")
    @ResponseWrapper(localName = "getFournisseursByMcResponse", targetNamespace = "http://business.service/", className = "service.business.GetFournisseursByMcResponse")
    @Action(input = "http://business.service/IUser/getFournisseursByMcRequest", output = "http://business.service/IUser/getFournisseursByMcResponse")
    public List<Fournisseur> getFournisseursByMc(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns service.business.Fournisseur
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateFournisseur", targetNamespace = "http://business.service/", className = "service.business.UpdateFournisseur")
    @ResponseWrapper(localName = "updateFournisseurResponse", targetNamespace = "http://business.service/", className = "service.business.UpdateFournisseurResponse")
    @Action(input = "http://business.service/IUser/updateFournisseurRequest", output = "http://business.service/IUser/updateFournisseurResponse")
    public Fournisseur updateFournisseur(
        @WebParam(name = "arg0", targetNamespace = "")
        Fournisseur arg0);

    /**
     * 
     * @return
     *     returns java.util.List<service.business.Fournisseur>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllFournisseurs", targetNamespace = "http://business.service/", className = "service.business.GetAllFournisseurs")
    @ResponseWrapper(localName = "getAllFournisseursResponse", targetNamespace = "http://business.service/", className = "service.business.GetAllFournisseursResponse")
    @Action(input = "http://business.service/IUser/getAllFournisseursRequest", output = "http://business.service/IUser/getAllFournisseursResponse")
    public List<Fournisseur> getAllFournisseurs();

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteFournisseur", targetNamespace = "http://business.service/", className = "service.business.DeleteFournisseur")
    @ResponseWrapper(localName = "deleteFournisseurResponse", targetNamespace = "http://business.service/", className = "service.business.DeleteFournisseurResponse")
    @Action(input = "http://business.service/IUser/deleteFournisseurRequest", output = "http://business.service/IUser/deleteFournisseurResponse")
    public boolean deleteFournisseur(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<service.business.Client>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getClientByMc", targetNamespace = "http://business.service/", className = "service.business.GetClientByMc")
    @ResponseWrapper(localName = "getClientByMcResponse", targetNamespace = "http://business.service/", className = "service.business.GetClientByMcResponse")
    @Action(input = "http://business.service/IUser/getClientByMcRequest", output = "http://business.service/IUser/getClientByMcResponse")
    public List<Client> getClientByMc(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}