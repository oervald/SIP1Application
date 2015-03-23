/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import EnityClass.Person;
import EnityClass.Proposal;
import facades.PersonFacade;
import facades.ProposalFacade;

/**
 *
 * @author Henrik
 */
public class SetupFile {

    public static void main(String[] args) {
        PersonFacade persf = new PersonFacade();
        ProposalFacade propf = new ProposalFacade();

        Person a = new Person("Bjarke", "Carlsen", "Student");
        Person b = new Person("Emil", "Christensen", "Student");
        Person c = new Person("Jesper", "Dahl", "Student");
        Person d = new Person("Kenn", "Jacobsen", "Student");
        Person e = new Person("Aske", "Rhode", "Student");
        Person f = new Person("Thor", "Kristensen", "Student");
        Person g = new Person("Patrick", "Larsen", "Student");
        Person h = new Person("Johan", "Leu", "Student");
        Person i = new Person("Jesper", "Olsen", "Student");
        Person j = new Person("Martin", "Olgenkjær", "Student");
        Person k = new Person("Henrik", "Stavnem", "Student");
        Person l = new Person("Nicklas", "Thomsen", "Student");

        persf.addNewPerson(a);
        persf.addNewPerson(b);
        persf.addNewPerson(c);
        persf.addNewPerson(d);
        persf.addNewPerson(e);
        persf.addNewPerson(f);
        persf.addNewPerson(g);
        persf.addNewPerson(h);
        persf.addNewPerson(i);
        persf.addNewPerson(j);
        persf.addNewPerson(k);
        persf.addNewPerson(l);
        
        
        Proposal m = new Proposal("C#", "Learning and achiving skills in the most fundemental ways of using C#", "THOR");
        Proposal n = new Proposal("Python","Learning and achiving skills in the most fundemental ways of using Python", "AKA");
        Proposal o = new Proposal("Android","Learning and achiving skills in the most fundemental ways of using Android","PELO");
        Proposal p = new Proposal("SW Design", "Learning and achiving skills in the most fundemental ways of using SW Design", "AKA");
        Proposal q = new Proposal("Games", "Learning and achiving skills in the most fundemental ways of using Games", "MAKL");
        Proposal r = new Proposal("Database", "Learning and achiving skills in the most fundemental ways of using Databases", "HTSY");
        Proposal s = new Proposal("Test","Learning and achiving skills in the most fundemental ways of using Test", "HTSY");
        Proposal t = new Proposal("Arduino","Learning and achiving skills in the most fundemental ways of using Arduino", "TOHA");
        /*
        propf.addProposal(m);
        propf.addProposal(n);
        propf.addProposal(o);
        propf.addProposal(p);
        propf.addProposal(q);
        propf.addProposal(r);
        propf.addProposal(s);
        propf.addProposal(t);
        */

    }

}
