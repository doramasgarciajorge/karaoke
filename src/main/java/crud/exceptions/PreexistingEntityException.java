package crud.exceptions;

/*
------------------------------------------------------------
> KARAOKE

- AUTHOR:     Doramas García Jorge
- EMAIL:      doramas.dev@pm.me
- GITHUB:     https://github.com/doramasgarciajorge
- REPOSITORY: https://github.com/doramasgarciajorge/karaoke
------------------------------------------------------------
*/


public class PreexistingEntityException extends Exception {
    public PreexistingEntityException(String message, Throwable cause) {
        super(message, cause);
    }
    public PreexistingEntityException(String message) {
        super(message);
    }
}
