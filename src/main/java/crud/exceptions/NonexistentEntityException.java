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


public class NonexistentEntityException extends Exception {
    public NonexistentEntityException(String message, Throwable cause) {
        super(message, cause);
    }
    public NonexistentEntityException(String message) {
        super(message);
    }
}
