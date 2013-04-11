/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
package net.sourceforge.pmd.cpd;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.StringReader;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.IntStream;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

import net.sourceforge.pmd.cpd.cppast.SimpleCharStream;
import net.sourceforge.pmd.cpd.tnsdl.TNSDLLexer;
import net.sourceforge.pmd.cpd.tnsdl.TNSDLParser;


/**
 * Tnsdl tokenizer
 *
 * @author Ran Nyman
 */
public class TnsdlTokenizer implements Tokenizer {
    public static final String TOKENS = " \t!#$%^&*(){}-=+<>/\\`~;:";

    public void tokenize(SourceCode sourceCode, Tokens tokenEntries) {
        StringBuffer sb = sourceCode.getCodeBuffer();
        //BufferedReader reader = new BufferedReader(new CharArrayReader(sb.toString().toCharArray()));
        TNSDLLexer reader = new TNSDLLexer();
        ANTLRStringStream input = new ANTLRStringStream(sb.toString());
        reader.setCharStream(input);
        CommonTokenStream tokens = new CommonTokenStream(reader);
        //TNSDLParser parser = new TNSDLParser(tokens);
        try
        {
        	while (true)
        	{
        		Token tok = reader.nextToken();
        		if (Token.EOF_TOKEN == tok)
        		{
        			break;
        		}
        		TokenEntry entry = new TokenEntry(tok.getText(), 
        				sourceCode.getFileName(), reader.getLine());
        		tokenEntries.add(entry);
        	}
        } 
        catch (Exception ex) 
        {
            ex.printStackTrace();
        } 
        finally 
        {
        
            tokenEntries.add(TokenEntry.getEOF());
        }
    }
}
