/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
package net.sourceforge.pmd.cpd;

import java.io.File;
import java.io.FilenameFilter;

public class TnsdlLanguage implements Language {

	public static class TnsdlFileOrDirectoryFilter implements FilenameFilter {
        public boolean accept(File dir, String filename) 
        {
        	String lowerCaseFileName = filename.toLowerCase();
            return lowerCaseFileName.endsWith(".sdl") || lowerCaseFileName.endsWith(".sdt") ||
            	lowerCaseFileName.endsWith(".spd") ||
            	(new File(dir.getAbsolutePath() + fileSeparator + filename).isDirectory());
        }
    }

    private TnsdlTokenizer tokenizer;

    public TnsdlLanguage() {
        tokenizer = new TnsdlTokenizer();
    }

    public Tokenizer getTokenizer() {
        return tokenizer;
    }

    public FilenameFilter getFileFilter() {
        return new TnsdlFileOrDirectoryFilter();
    }
}
