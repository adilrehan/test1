
/**
 * ServiceNow_u_cmdb_rel_inboundCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:18:42 CET)
 */

    package com.service_now.www;

    /**
     *  ServiceNow_u_cmdb_rel_inboundCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ServiceNow_u_cmdb_rel_inboundCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ServiceNow_u_cmdb_rel_inboundCallbackHandler(Object clientData){
        this.clientData = clientData; 
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ServiceNow_u_cmdb_rel_inboundCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for aggregate method
            * override this method for handling normal response from aggregate operation
            */
           public void receiveResultaggregate(
                    com.service_now.www.ServiceNow_u_cmdb_rel_inboundStub.AggregateResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from aggregate operation
           */
            public void receiveErroraggregate(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for insert method
            * override this method for handling normal response from insert operation
            */
           public void receiveResultinsert(
                    com.service_now.www.ServiceNow_u_cmdb_rel_inboundStub.InsertResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from insert operation
           */
            public void receiveErrorinsert(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteRecord method
            * override this method for handling normal response from deleteRecord operation
            */
           public void receiveResultdeleteRecord(
                    com.service_now.www.ServiceNow_u_cmdb_rel_inboundStub.DeleteRecordResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteRecord operation
           */
            public void receiveErrordeleteRecord(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for update method
            * override this method for handling normal response from update operation
            */
           public void receiveResultupdate(
                    com.service_now.www.ServiceNow_u_cmdb_rel_inboundStub.UpdateResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from update operation
           */
            public void receiveErrorupdate(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteMultiple method
            * override this method for handling normal response from deleteMultiple operation
            */
           public void receiveResultdeleteMultiple(
                    com.service_now.www.ServiceNow_u_cmdb_rel_inboundStub.DeleteMultipleResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteMultiple operation
           */
            public void receiveErrordeleteMultiple(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getRecords method
            * override this method for handling normal response from getRecords operation
            */
           public void receiveResultgetRecords(
                    com.service_now.www.ServiceNow_u_cmdb_rel_inboundStub.GetRecordsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getRecords operation
           */
            public void receiveErrorgetRecords(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getKeys method
            * override this method for handling normal response from getKeys operation
            */
           public void receiveResultgetKeys(
                    com.service_now.www.ServiceNow_u_cmdb_rel_inboundStub.GetKeysResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getKeys operation
           */
            public void receiveErrorgetKeys(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for get method
            * override this method for handling normal response from get operation
            */
           public void receiveResultget(
                    com.service_now.www.ServiceNow_u_cmdb_rel_inboundStub.GetResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from get operation
           */
            public void receiveErrorget(java.lang.Exception e) {
            }
                


    }
    