/*
 * AccountsUtilities.java
 *
 * Copyright 2012 SIOS www.sios.com.ve.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package ve.com.sios.gpff.common;

/**
 * The Class AccountsUtilities.
 *
 * @author Jose Luis Estevez jestevez@indesoft.org.ve jose.estevez.prieto@gmail.com
 * @version 1.0
 * @date 25/01/2013
 */
public final class AccountsUtilities {

    /** The Constant ELEVEN_MODULE. */
    private static final int ELEVEN_MODULE = 11;

    /**
     * Instantiates a new accounts utilities.
     */
    private AccountsUtilities() {
        super();
    }

    /**
     * Valida los dígitos de control de una cuenta.
     *
     * @param account the account
     * @return true, if is valid account
     */
    public static boolean isValidAccount(String account) {

        if (account == null || account.length() != 20) {
            return false;
        }

        boolean valid = true;

        if (valid) {
            String bankBranch = account.substring(0, 8);
            int factor = 2;
            int residue1 = 0;
            for (int i = bankBranch.length(); i > 0; i--) {
                residue1 = Integer.parseInt(bankBranch.substring(i - 1, i)) * factor + residue1;
                if (factor == 7) {
                    factor = 2;
                } else {
                    factor++;
                }
            }

            residue1 %= ELEVEN_MODULE;
            residue1 = ELEVEN_MODULE - residue1;
            int checkDigit1 = 0;
            switch (residue1) {
            case 10:
                checkDigit1 = 0;
                break;

            case 11:
                checkDigit1 = 1;
                break;

            default:
                if (residue1 > ELEVEN_MODULE) {
                    residue1 %= ELEVEN_MODULE;
                    checkDigit1 = residue1;
                } else {
                    checkDigit1 = residue1;
                }
                break;
            }
            if (!String.valueOf(checkDigit1).equals(account.substring(8, 9))) {
                valid = false;
            }
            if (valid) {
                String office = account.substring(4, 8);
                String accountNumber = account.substring(10, 20);
                String officeAccount = office + accountNumber;
                factor = 2;
                int residue2 = 0;
                for (int i = officeAccount.length(); i > 0; i--) {
                    residue2 = Integer.parseInt(officeAccount.substring(i - 1, i)) * factor + residue2;
                    if (factor == 7) {
                        factor = 2;
                    } else {
                        factor++;
                    }
                }

                residue2 %= ELEVEN_MODULE;
                residue2 = ELEVEN_MODULE - residue2;
                int checkDigit2 = 0;
                switch (residue2) {
                case 10:
                    checkDigit2 = 0;
                    break;

                case 11:
                    checkDigit2 = 1;
                    break;

                default:
                    if (residue2 > ELEVEN_MODULE) {
                        residue2 %= ELEVEN_MODULE;
                        checkDigit2 = residue2;
                    } else {
                        checkDigit2 = residue2;
                    }
                    break;
                }
                if (!String.valueOf(checkDigit2).equals(account.substring(9, 10))) {
                    valid = false;
                }
            }
        }
        return valid;
    }

}
