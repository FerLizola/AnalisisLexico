/* The following code was generated by JFlex 1.6.1 */

package analisislexico;
import static analisislexico.Token.*;
import java.io.Reader;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>src/analisislexico/lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\5\1\6\1\6\1\5\22\0\1\3\1\13\1\0"+
    "\1\4\2\0\1\16\1\7\1\10\1\10\1\15\1\14\1\0\1\14"+
    "\1\0\1\15\12\2\1\0\1\52\1\12\1\11\1\12\2\0\1\45"+
    "\3\1\1\50\3\1\1\43\5\1\1\40\1\47\1\1\1\51\10\1"+
    "\1\20\1\0\1\20\1\0\1\1\1\0\1\37\1\26\1\25\1\31"+
    "\1\22\1\23\1\27\1\44\1\30\2\1\1\41\1\42\1\24\1\34"+
    "\2\1\1\21\1\33\1\35\1\32\1\46\1\36\3\1\1\20\1\17"+
    "\1\20\7\0\1\6\u1fa2\0\1\6\1\6\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\2\4\1\1\1\5\1\6"+
    "\1\7\1\10\2\11\2\1\17\2\1\12\1\0\1\7"+
    "\1\10\6\2\2\13\15\2\1\14\51\2";

  private static int [] zzUnpackAction() {
    int [] result = new int[97];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\53\0\126\0\201\0\53\0\254\0\327\0\53"+
    "\0\u0102\0\u0102\0\u0102\0\201\0\53\0\u012d\0\u0158\0\u0183"+
    "\0\u01ae\0\u01d9\0\u0204\0\u022f\0\u025a\0\u0285\0\u02b0\0\u02db"+
    "\0\u0306\0\u0331\0\u035c\0\u0387\0\u03b2\0\u03dd\0\53\0\u0408"+
    "\0\53\0\53\0\u0433\0\u045e\0\u0489\0\u04b4\0\u04df\0\u050a"+
    "\0\126\0\u0535\0\u0560\0\u058b\0\u05b6\0\u05e1\0\u0535\0\u060c"+
    "\0\u0637\0\u0662\0\u068d\0\u06b8\0\u06e3\0\u070e\0\u0739\0\53"+
    "\0\u0764\0\u078f\0\u07ba\0\u07e5\0\u0810\0\u083b\0\u0866\0\u0891"+
    "\0\u08bc\0\u08e7\0\u0912\0\u093d\0\u0968\0\u0993\0\u09be\0\u09e9"+
    "\0\u0a14\0\u0a3f\0\u0a6a\0\u0a95\0\u0ac0\0\u0aeb\0\u0b16\0\u0b41"+
    "\0\u0b6c\0\u0b97\0\u0bc2\0\u0bed\0\u0c18\0\u0c43\0\u0c6e\0\u0c99"+
    "\0\u0cc4\0\u0cef\0\u0d1a\0\u0d45\0\u0d70\0\u0d9b\0\u0dc6\0\u0df1"+
    "\0\u0e1c";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[97];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\5\1\0\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\10\1\20\1\21\1\22\2\3\1\23\1\3\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\3"+
    "\1\34\2\3\1\35\1\3\1\36\3\3\1\37\54\0"+
    "\2\3\16\0\31\3\3\0\1\4\50\0\5\6\2\0"+
    "\44\6\7\40\2\0\42\40\11\0\1\41\57\0\1\42"+
    "\53\0\1\42\34\0\2\3\16\0\1\3\1\43\27\3"+
    "\2\0\2\3\16\0\3\3\1\44\25\3\2\0\2\3"+
    "\16\0\13\3\1\45\4\3\1\46\10\3\2\0\2\3"+
    "\16\0\1\3\1\47\11\3\1\50\15\3\2\0\2\3"+
    "\16\0\2\3\1\51\1\52\25\3\2\0\2\3\16\0"+
    "\1\3\1\53\5\3\1\54\21\3\2\0\2\3\16\0"+
    "\12\3\1\55\16\3\2\0\2\3\16\0\21\3\1\56"+
    "\7\3\2\0\2\3\16\0\11\3\1\57\17\3\2\0"+
    "\2\3\16\0\1\3\1\60\7\3\1\61\1\3\1\62"+
    "\15\3\2\0\2\3\16\0\1\63\30\3\2\0\2\3"+
    "\16\0\3\3\1\64\25\3\2\0\2\3\16\0\13\3"+
    "\1\65\15\3\2\0\2\3\16\0\11\3\1\66\17\3"+
    "\2\0\2\3\16\0\16\3\1\67\12\3\10\0\1\70"+
    "\44\0\2\3\16\0\2\3\1\71\13\3\1\44\12\3"+
    "\2\0\2\3\16\0\10\3\1\51\20\3\2\0\2\3"+
    "\16\0\1\51\30\3\2\0\2\3\16\0\13\3\1\72"+
    "\15\3\2\0\2\3\16\0\6\3\1\73\22\3\2\0"+
    "\2\3\16\0\13\3\1\74\15\3\2\0\2\3\16\0"+
    "\14\3\1\51\14\3\2\0\2\3\16\0\2\3\1\51"+
    "\26\3\2\0\2\3\16\0\6\3\1\75\22\3\2\0"+
    "\2\3\16\0\1\3\1\51\27\3\2\0\2\3\16\0"+
    "\16\3\1\76\12\3\2\0\2\3\16\0\21\3\1\77"+
    "\7\3\2\0\2\3\16\0\1\100\30\3\2\0\2\3"+
    "\16\0\30\3\1\101\2\0\2\3\16\0\7\3\1\102"+
    "\21\3\2\0\2\3\16\0\16\3\1\103\12\3\2\0"+
    "\2\3\16\0\3\3\1\104\25\3\2\0\2\3\16\0"+
    "\21\3\1\105\7\3\2\0\2\3\16\0\20\3\1\106"+
    "\10\3\2\0\2\3\16\0\1\3\1\107\27\3\2\0"+
    "\2\3\16\0\16\3\1\57\12\3\2\0\2\3\16\0"+
    "\7\3\1\110\21\3\2\0\2\3\16\0\20\3\1\111"+
    "\10\3\2\0\2\3\16\0\7\3\1\112\21\3\2\0"+
    "\2\3\16\0\20\3\1\113\10\3\2\0\2\3\16\0"+
    "\22\3\1\114\6\3\2\0\2\3\16\0\3\3\1\115"+
    "\25\3\2\0\2\3\16\0\1\3\1\116\27\3\2\0"+
    "\2\3\16\0\14\3\1\55\14\3\2\0\2\3\16\0"+
    "\20\3\1\117\10\3\2\0\2\3\16\0\6\3\1\51"+
    "\22\3\2\0\2\3\16\0\24\3\1\120\4\3\2\0"+
    "\2\3\16\0\26\3\1\121\1\122\1\3\2\0\2\3"+
    "\16\0\1\123\30\3\2\0\2\3\16\0\3\3\1\51"+
    "\25\3\2\0\2\3\16\0\1\3\1\124\27\3\2\0"+
    "\2\3\16\0\14\3\1\125\14\3\2\0\2\3\16\0"+
    "\20\3\1\51\10\3\2\0\2\3\16\0\10\3\1\126"+
    "\20\3\2\0\2\3\16\0\17\3\1\127\11\3\2\0"+
    "\2\3\16\0\14\3\1\130\14\3\2\0\2\3\16\0"+
    "\13\3\1\131\15\3\2\0\2\3\16\0\21\3\1\132"+
    "\7\3\2\0\2\3\16\0\23\3\1\51\5\3\2\0"+
    "\2\3\16\0\20\3\1\133\10\3\2\0\2\3\16\0"+
    "\1\3\1\134\27\3\2\0\2\3\16\0\16\3\1\110"+
    "\12\3\2\0\2\3\16\0\16\3\1\113\12\3\2\0"+
    "\2\3\16\0\1\3\1\125\27\3\2\0\2\3\16\0"+
    "\2\3\1\53\1\51\25\3\2\0\2\3\16\0\11\3"+
    "\1\135\17\3\2\0\2\3\16\0\6\3\1\136\22\3"+
    "\2\0\2\3\16\0\5\3\1\51\23\3\2\0\2\3"+
    "\16\0\1\3\1\137\27\3\2\0\2\3\16\0\3\3"+
    "\1\140\25\3\2\0\2\3\16\0\1\110\30\3\2\0"+
    "\2\3\16\0\7\3\1\141\21\3\2\0\2\3\16\0"+
    "\4\3\1\57\24\3\2\0\2\3\16\0\4\3\1\55"+
    "\24\3\2\0\2\3\16\0\4\3\1\51\24\3\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3655];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\1\11\2\1\1\11\4\1\1\11"+
    "\21\1\1\11\1\0\2\11\25\1\1\11\51\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[97];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
public String lexeme;
private TablaSimbolos tabla;
public Lexer(Reader in,TablaSimbolos t){
    this(in);
    this.tabla=t;
    }
public int linea;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 186) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { lexeme=yytext(); linea=yyline; return ERROR;
            }
          case 13: break;
          case 2: 
            { lexeme=yytext(); linea=yyline; 
                Simbolo s;
                if((s=tabla.buscar(lexeme))==null)
                    s=tabla.insertar(lexeme);return ID;
            }
          case 14: break;
          case 3: 
            { lexeme=yytext(); linea=yyline; return INT;
            }
          case 15: break;
          case 4: 
            { /* ignore */
            }
          case 16: break;
          case 5: 
            { lexeme=yytext(); linea=yyline; return OPAGR;
            }
          case 17: break;
          case 6: 
            { lexeme=yytext();linea=yyline; return OPASIG;
            }
          case 18: break;
          case 7: 
            { lexeme=yytext(); linea=yyline; return OPREL;
            }
          case 19: break;
          case 8: 
            { lexeme=yytext(); linea=yyline; return OPLOG;
            }
          case 20: break;
          case 9: 
            { lexeme=yytext(); linea=yyline; return OPARIT;
            }
          case 21: break;
          case 10: 
            { lexeme=yytext(); linea=yyline; return ENDLN;
            }
          case 22: break;
          case 11: 
            { lexeme=yytext(); linea=yyline; return PALRES;
            }
          case 23: break;
          case 12: 
            { /*Ignore*/
            }
          case 24: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
