/*
 * ProcessMaker API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 1.0.0
 * Contact: info@processmaker.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import ProcessMaker_Client.ApiException;
import java.io.File;
import org.openapitools.client.model.InlineResponse20012;
import org.openapitools.client.model.InlineResponse20013;
import org.openapitools.client.model.Process;
import org.openapitools.client.model.ProcessEditable;
import org.openapitools.client.model.ProcessRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProcessesApi
 */
@Ignore
public class ProcessesApiTest {

    private final ProcessesApi api = new ProcessesApi();

    
    /**
     * Save a new process
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createProcessTest() throws ApiException {
        ProcessEditable processEditable = null;
        Process response = api.createProcess(processEditable);

        // TODO: test validations
    }
    
    /**
     * Delete a process
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteProcessTest() throws ApiException {
        String processId = null;
        Process response = api.deleteProcess(processId);

        // TODO: test validations
    }
    
    /**
     * Export a single process by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void exportProcessTest() throws ApiException {
        String processId = null;
        Process response = api.exportProcess(processId);

        // TODO: test validations
    }
    
    /**
     * Get single process by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProcessByIdTest() throws ApiException {
        String processId = null;
        Process response = api.getProcessById(processId);

        // TODO: test validations
    }
    
    /**
     * Returns all processes that the user has access to
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProcessesTest() throws ApiException {
        String filter = null;
        String orderBy = null;
        String orderDirection = null;
        Integer perPage = null;
        String status = null;
        String include = null;
        InlineResponse20012 response = api.getProcesses(filter, orderBy, orderDirection, perPage, status, include);

        // TODO: test validations
    }
    
    /**
     * Import a new process
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void importProcessTest() throws ApiException {
        File file = null;
        Process response = api.importProcess(file);

        // TODO: test validations
    }
    
    /**
     * Restore an inactive process
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void restoreProcessTest() throws ApiException {
        String processId = null;
        ProcessEditable processEditable = null;
        Process response = api.restoreProcess(processId, processEditable);

        // TODO: test validations
    }
    
    /**
     * Returns the list of processes that the user can start
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startProcessesTest() throws ApiException {
        String orderBy = null;
        String orderDirection = null;
        Integer perPage = null;
        String include = null;
        InlineResponse20013 response = api.startProcesses(orderBy, orderDirection, perPage, include);

        // TODO: test validations
    }
    
    /**
     * Start a new process
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void triggerStartEventTest() throws ApiException {
        String processId = null;
        String event = null;
        Object body = null;
        ProcessRequest response = api.triggerStartEvent(processId, event, body);

        // TODO: test validations
    }
    
    /**
     * Update a process
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateProcessTest() throws ApiException {
        String processId = null;
        ProcessEditable processEditable = null;
        Process response = api.updateProcess(processId, processEditable);

        // TODO: test validations
    }
    
}
