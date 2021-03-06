package net.i2p.crypto.eddsa;

import net.i2p.crypto.eddsa.spec.EdDSAParameterSpec;

/**
 * Common interface for all EdDSA keys.
 * @author str4d
 */
public interface EdDSAKey {
    /**
     * The reported key algorithm for all EdDSA keys
     */
    String KEY_ALGORITHM = "EdDSA";

    /**
     * return a parameter specification representing the EdDSA domain
     * parameters for the key.
     */
    EdDSAParameterSpec getParams();
}
