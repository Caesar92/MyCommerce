
package com.mycommerce.project.dao.exception;

public class UnknownPersonException extends RuntimeException {

    public UnknownPersonException(Long id) {
        super("The person with id=" + id + " doesn't exist.");
    }
}
