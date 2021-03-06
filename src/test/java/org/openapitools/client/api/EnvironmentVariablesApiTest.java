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
import org.openapitools.client.model.EnvironmentVariables;
import org.openapitools.client.model.EnvironmentVariablesEditable;
import org.openapitools.client.model.InlineResponse2001;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EnvironmentVariablesApi
 */
@Ignore
public class EnvironmentVariablesApiTest {

    private final EnvironmentVariablesApi api = new EnvironmentVariablesApi();

    
    /**
     * Save a new environment_variables
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createEnvironmentVariablesTest() throws ApiException {
        EnvironmentVariablesEditable environmentVariablesEditable = null;
        EnvironmentVariables response = api.createEnvironmentVariables(environmentVariablesEditable);

        // TODO: test validations
    }
    
    /**
     * Delete a environment_variables
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteEnvironmentVariablesTest() throws ApiException {
        String environmentVariablesId = null;
        EnvironmentVariables response = api.deleteEnvironmentVariables(environmentVariablesId);

        // TODO: test validations
    }
    
    /**
     * Returns all environmentVariables that the user has access to
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEnvironmentVariablesTest() throws ApiException {
        String filter = null;
        String orderBy = null;
        String orderDirection = null;
        Integer perPage = null;
        String include = null;
        InlineResponse2001 response = api.getEnvironmentVariables(filter, orderBy, orderDirection, perPage, include);

        // TODO: test validations
    }
    
    /**
     * Get single environment_variables by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEnvironmentVariablesByIdTest() throws ApiException {
        String environmentVariablesId = null;
        EnvironmentVariables response = api.getEnvironmentVariablesById(environmentVariablesId);

        // TODO: test validations
    }
    
    /**
     * Update a environment_variables
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateEnvironmentVariablesTest() throws ApiException {
        String environmentVariablesId = null;
        EnvironmentVariablesEditable environmentVariablesEditable = null;
        EnvironmentVariables response = api.updateEnvironmentVariables(environmentVariablesId, environmentVariablesEditable);

        // TODO: test validations
    }
    
}
