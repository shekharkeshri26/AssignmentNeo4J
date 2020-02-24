package com.api.assignment.exception;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Error Response
 * @author shekhar
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
class ErrorResponse
{
    private String message;
    private List<String> details;
}