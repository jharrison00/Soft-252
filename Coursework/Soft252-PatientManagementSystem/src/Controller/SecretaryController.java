/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Users.Secretary;
import View.SecretaryView;

/**
 *
 * @author jonat
 */
public class SecretaryController {
    public static void setView(Secretary secretary)
    {
        SecretaryView.secretaryHome(secretary);
    }
}
