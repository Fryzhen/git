package fr.iut.editeur.document;

import junit.framework.TestCase;

public class DocumentTest extends TestCase {



    public void testAjouter() {
        Document d1 = new Document();
        d1.ajouter("test");
        assertEquals("test", d1.getTexte());
    }

    public void testRemplacer() {
        Document d1 = new Document();
        d1.ajouter("test");
        d1.remplacer(0, 4, "toto");
        assertEquals("toto", d1.getTexte());

    }
}