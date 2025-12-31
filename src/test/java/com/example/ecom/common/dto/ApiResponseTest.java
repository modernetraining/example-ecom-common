package com.example.ecom.common.dto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ApiResponseTest {

    @Test
    public void testSuccess() {
        ApiResponse<String> response = ApiResponse.success("test data");
        assertTrue(response.isSuccess());
        assertEquals("Success", response.getMessage());
        assertEquals("test data", response.getData());
    }

    @Test
    public void testError() {
        ApiResponse<String> response = ApiResponse.error("Bad Request");
        assertFalse(response.isSuccess());
        assertEquals("Bad Request", response.getMessage());
        assertNull(response.getData());
    }
}
