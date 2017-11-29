/* The following code was generated by JFlex 1.6.1 */

package analisislexico;
import static analisislexico.Token.*;
import java_cup.runtime.Symbol;
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
    "\11\0\1\3\1\5\1\6\1\6\1\5\22\0\1\3\1\14\1\0"+
    "\1\4\2\0\1\21\1\7\1\23\1\10\1\16\1\15\1\75\1\17"+
    "\1\73\1\20\1\60\1\61\1\62\1\63\1\64\5\2\1\0\1\74"+
    "\1\12\1\11\1\13\2\0\1\54\2\1\1\71\1\57\3\1\1\52"+
    "\2\1\1\67\1\65\1\1\1\47\1\56\1\1\1\72\3\1\1\66"+
    "\4\1\1\26\1\0\1\27\1\0\1\1\1\0\1\46\1\35\1\34"+
    "\1\40\1\31\1\32\1\36\1\53\1\37\2\1\1\50\1\51\1\33"+
    "\1\43\2\1\1\30\1\42\1\44\1\41\1\55\1\45\2\1\1\70"+
    "\1\24\1\22\1\25\7\0\1\6\u1fa2\0\1\6\1\6\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

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
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\2\1"+
    "\1\16\1\17\1\20\1\21\1\22\20\2\1\23\1\24"+
    "\2\0\1\25\1\26\1\27\1\30\1\3\1\31\1\32"+
    "\10\2\1\33\1\34\16\2\1\35\1\36\1\37\1\40"+
    "\1\41\2\2\1\42\1\43\2\2\1\44\1\2\1\45"+
    "\5\2\1\46\1\47\1\2\1\50\3\2\1\51\13\2"+
    "\1\52\1\53\11\2\1\54\5\2\1\55\1\2\1\56"+
    "\5\2\1\57\1\60\1\61\6\2\1\62\1\2\1\63"+
    "\3\2\1\64\3\2\1\65\5\2\1\66\3\2\1\67"+
    "\2\2\1\70\2\2\1\71\4\2\1\72\1\2\1\73"+
    "\1\74\1\75\1\2\1\76\2\2\1\77\3\2\1\100"+
    "\1\101\1\102\1\103\1\104\1\2\1\105\1\2\1\106";

  private static int [] zzUnpackAction() {
    int [] result = new int[199];
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
    "\0\0\0\76\0\174\0\272\0\76\0\370\0\u0136\0\76"+
    "\0\u0174\0\u01b2\0\u01f0\0\u022e\0\u026c\0\76\0\u026c\0\76"+
    "\0\u02aa\0\u02e8\0\76\0\76\0\76\0\76\0\76\0\u0326"+
    "\0\u0364\0\u03a2\0\u03e0\0\u041e\0\u045c\0\u049a\0\u04d8\0\u0516"+
    "\0\u0554\0\u0592\0\u05d0\0\u060e\0\u064c\0\u068a\0\u06c8\0\76"+
    "\0\76\0\u0706\0\u0744\0\76\0\76\0\76\0\76\0\u026c"+
    "\0\76\0\76\0\u0782\0\u07c0\0\u07fe\0\u083c\0\u087a\0\u08b8"+
    "\0\u08f6\0\u0934\0\174\0\u0972\0\u09b0\0\u09ee\0\u0a2c\0\u0a6a"+
    "\0\u0aa8\0\u0ae6\0\u0b24\0\u0b62\0\u0ba0\0\u0bde\0\u0c1c\0\u0c5a"+
    "\0\u0c98\0\u0cd6\0\174\0\174\0\174\0\174\0\174\0\u0d14"+
    "\0\u0d52\0\u0706\0\76\0\u0d90\0\u0dce\0\174\0\u0e0c\0\174"+
    "\0\u0e4a\0\u0e88\0\u0ec6\0\u0f04\0\u0f42\0\174\0\174\0\u0f80"+
    "\0\174\0\u0fbe\0\u0ffc\0\u103a\0\174\0\u1078\0\u10b6\0\u10f4"+
    "\0\u1132\0\u1170\0\u11ae\0\u11ec\0\u122a\0\u1268\0\u12a6\0\u12e4"+
    "\0\174\0\174\0\u1322\0\u1360\0\u139e\0\u13dc\0\u141a\0\u1458"+
    "\0\u1496\0\u14d4\0\u1512\0\174\0\u1550\0\u158e\0\u15cc\0\u160a"+
    "\0\u1648\0\174\0\u1686\0\174\0\u16c4\0\u1702\0\u1740\0\u177e"+
    "\0\u17bc\0\174\0\174\0\174\0\u17fa\0\u1838\0\u1876\0\u18b4"+
    "\0\u18f2\0\u1930\0\174\0\u196e\0\174\0\u19ac\0\u19ea\0\u1a28"+
    "\0\174\0\u1a66\0\u1aa4\0\u1ae2\0\174\0\u1b20\0\u1b5e\0\u1b9c"+
    "\0\u1bda\0\u1c18\0\174\0\u1c56\0\u1c94\0\u1cd2\0\174\0\u1d10"+
    "\0\u1d4e\0\174\0\u1d8c\0\u1dca\0\174\0\u1e08\0\u1e46\0\u1e84"+
    "\0\u1ec2\0\174\0\u1f00\0\174\0\174\0\174\0\u1f3e\0\174"+
    "\0\u1f7c\0\u1fba\0\174\0\u1ff8\0\u2036\0\u2074\0\174\0\174"+
    "\0\174\0\174\0\174\0\u20b2\0\174\0\u20f0\0\174";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[199];
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
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\1\32\2\3\1\33\1\3\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\3\1\44"+
    "\2\3\1\45\1\46\1\47\2\3\5\4\6\3\1\2"+
    "\1\50\1\51\77\0\2\3\25\0\43\3\5\0\1\4"+
    "\55\0\5\4\6\0\1\52\2\0\5\6\2\0\67\6"+
    "\7\53\2\0\12\53\1\0\52\53\11\0\1\54\75\0"+
    "\1\55\75\0\1\56\75\0\1\57\66\0\1\60\55\0"+
    "\5\60\32\0\1\61\76\0\1\62\54\0\2\3\25\0"+
    "\1\3\1\63\41\3\4\0\2\3\25\0\3\3\1\64"+
    "\14\3\1\65\22\3\4\0\2\3\25\0\13\3\1\66"+
    "\2\3\1\67\1\3\1\70\22\3\4\0\2\3\25\0"+
    "\1\3\1\71\11\3\1\72\27\3\4\0\2\3\25\0"+
    "\2\3\1\73\1\74\37\3\4\0\2\3\25\0\1\3"+
    "\1\75\5\3\1\76\33\3\4\0\2\3\25\0\12\3"+
    "\1\77\30\3\4\0\2\3\25\0\21\3\1\100\21\3"+
    "\4\0\2\3\25\0\3\3\1\101\5\3\1\102\31\3"+
    "\4\0\2\3\25\0\1\103\1\104\7\3\1\105\1\3"+
    "\1\106\27\3\4\0\2\3\25\0\1\107\42\3\4\0"+
    "\2\3\25\0\3\3\1\110\37\3\4\0\2\3\25\0"+
    "\13\3\1\111\27\3\4\0\2\3\25\0\11\3\1\112"+
    "\31\3\4\0\2\3\25\0\30\3\1\113\1\114\1\115"+
    "\1\116\1\117\6\3\4\0\2\3\25\0\13\3\1\120"+
    "\2\3\1\121\24\3\5\0\1\122\55\0\5\122\20\0"+
    "\1\123\67\0\2\3\25\0\2\3\1\124\13\3\1\125"+
    "\24\3\4\0\2\3\25\0\10\3\1\126\32\3\4\0"+
    "\2\3\25\0\12\3\1\127\30\3\4\0\2\3\25\0"+
    "\1\130\42\3\4\0\2\3\25\0\20\3\1\131\22\3"+
    "\4\0\2\3\25\0\13\3\1\132\27\3\4\0\2\3"+
    "\25\0\6\3\1\133\34\3\4\0\2\3\25\0\13\3"+
    "\1\134\5\3\1\135\21\3\4\0\2\3\25\0\14\3"+
    "\1\136\26\3\4\0\2\3\25\0\2\3\1\137\40\3"+
    "\4\0\2\3\25\0\6\3\1\140\34\3\4\0\2\3"+
    "\25\0\1\3\1\141\41\3\4\0\2\3\25\0\16\3"+
    "\1\142\24\3\4\0\2\3\25\0\36\3\1\143\1\144"+
    "\3\3\4\0\2\3\25\0\14\3\1\145\26\3\4\0"+
    "\2\3\25\0\11\3\1\146\31\3\4\0\2\3\25\0"+
    "\21\3\1\147\21\3\4\0\2\3\25\0\1\150\42\3"+
    "\4\0\2\3\25\0\42\3\1\151\4\0\2\3\25\0"+
    "\7\3\1\152\33\3\4\0\2\3\25\0\16\3\1\153"+
    "\24\3\4\0\2\3\25\0\3\3\1\154\37\3\4\0"+
    "\2\3\25\0\21\3\1\155\21\3\4\0\2\3\25\0"+
    "\7\3\1\156\33\3\4\0\2\3\25\0\20\3\1\157"+
    "\22\3\4\0\2\3\25\0\1\3\1\160\41\3\4\0"+
    "\2\3\25\0\10\3\1\161\32\3\4\0\2\3\25\0"+
    "\1\3\1\162\41\3\4\0\2\3\25\0\12\3\1\163"+
    "\30\3\4\0\2\3\25\0\16\3\1\164\24\3\4\0"+
    "\2\3\25\0\7\3\1\165\33\3\4\0\2\3\25\0"+
    "\20\3\1\166\22\3\4\0\2\3\25\0\5\3\1\167"+
    "\35\3\4\0\2\3\25\0\7\3\1\170\33\3\4\0"+
    "\2\3\25\0\20\3\1\171\22\3\4\0\2\3\25\0"+
    "\1\3\1\172\41\3\4\0\2\3\25\0\11\3\1\173"+
    "\31\3\4\0\2\3\25\0\1\3\1\174\41\3\4\0"+
    "\2\3\25\0\22\3\1\175\20\3\4\0\2\3\25\0"+
    "\3\3\1\176\37\3\4\0\2\3\25\0\1\3\1\177"+
    "\41\3\4\0\2\3\25\0\14\3\1\200\26\3\4\0"+
    "\2\3\25\0\20\3\1\201\22\3\4\0\2\3\25\0"+
    "\6\3\1\202\34\3\4\0\2\3\25\0\24\3\1\203"+
    "\16\3\4\0\2\3\25\0\10\3\1\204\32\3\4\0"+
    "\2\3\25\0\22\3\1\205\3\3\1\206\1\207\5\3"+
    "\1\210\5\3\4\0\2\3\25\0\1\211\42\3\4\0"+
    "\2\3\25\0\1\3\1\212\41\3\4\0\2\3\25\0"+
    "\14\3\1\213\26\3\4\0\2\3\25\0\3\3\1\214"+
    "\37\3\4\0\2\3\25\0\1\3\1\215\41\3\4\0"+
    "\2\3\25\0\24\3\1\216\1\3\1\217\6\3\1\220"+
    "\3\3\1\221\1\3\4\0\2\3\25\0\14\3\1\222"+
    "\26\3\4\0\2\3\25\0\20\3\1\223\22\3\4\0"+
    "\2\3\25\0\3\3\1\224\37\3\4\0\2\3\25\0"+
    "\40\3\1\225\2\3\4\0\2\3\25\0\10\3\1\226"+
    "\32\3\4\0\2\3\25\0\17\3\1\227\23\3\4\0"+
    "\2\3\25\0\14\3\1\230\26\3\4\0\2\3\25\0"+
    "\1\3\1\231\41\3\4\0\2\3\25\0\13\3\1\232"+
    "\27\3\4\0\2\3\25\0\21\3\1\233\21\3\4\0"+
    "\2\3\25\0\20\3\1\234\22\3\4\0\2\3\25\0"+
    "\23\3\1\235\17\3\4\0\2\3\25\0\20\3\1\236"+
    "\22\3\4\0\2\3\25\0\7\3\1\237\33\3\4\0"+
    "\2\3\25\0\1\3\1\240\41\3\4\0\2\3\25\0"+
    "\16\3\1\241\24\3\4\0\2\3\25\0\6\3\1\242"+
    "\34\3\4\0\2\3\25\0\23\3\1\243\17\3\4\0"+
    "\2\3\25\0\7\3\1\244\33\3\4\0\2\3\25\0"+
    "\1\3\1\245\41\3\4\0\2\3\25\0\16\3\1\246"+
    "\24\3\4\0\2\3\25\0\14\3\1\247\26\3\4\0"+
    "\2\3\25\0\1\3\1\250\41\3\4\0\2\3\25\0"+
    "\2\3\1\251\1\252\37\3\4\0\2\3\25\0\11\3"+
    "\1\253\31\3\4\0\2\3\25\0\6\3\1\254\34\3"+
    "\4\0\2\3\25\0\5\3\1\255\35\3\4\0\2\3"+
    "\25\0\11\3\1\256\31\3\4\0\2\3\25\0\1\3"+
    "\1\257\41\3\4\0\2\3\25\0\3\3\1\260\37\3"+
    "\4\0\2\3\25\0\3\3\1\261\37\3\4\0\2\3"+
    "\25\0\3\3\1\262\37\3\4\0\2\3\25\0\11\3"+
    "\1\263\31\3\4\0\2\3\25\0\3\3\1\264\37\3"+
    "\4\0\2\3\25\0\12\3\1\265\30\3\4\0\2\3"+
    "\25\0\20\3\1\266\22\3\4\0\2\3\25\0\16\3"+
    "\1\267\24\3\4\0\2\3\25\0\2\3\1\270\40\3"+
    "\4\0\2\3\25\0\1\271\42\3\4\0\2\3\25\0"+
    "\7\3\1\272\33\3\4\0\2\3\25\0\21\3\1\273"+
    "\21\3\4\0\2\3\25\0\4\3\1\274\36\3\4\0"+
    "\2\3\25\0\1\3\1\275\41\3\4\0\2\3\25\0"+
    "\4\3\1\276\36\3\4\0\2\3\25\0\16\3\1\277"+
    "\24\3\4\0\2\3\25\0\20\3\1\300\22\3\4\0"+
    "\2\3\25\0\3\3\1\301\37\3\4\0\2\3\25\0"+
    "\4\3\1\302\36\3\4\0\2\3\25\0\14\3\1\303"+
    "\26\3\4\0\2\3\25\0\1\304\42\3\4\0\2\3"+
    "\25\0\1\3\1\305\41\3\4\0\2\3\25\0\16\3"+
    "\1\306\24\3\4\0\2\3\25\0\20\3\1\307\22\3"+
    "\3\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8494];
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
    "\1\0\1\11\2\1\1\11\2\1\1\11\5\1\1\11"+
    "\1\1\1\11\2\1\5\11\20\1\2\11\2\0\4\11"+
    "\1\1\2\11\40\1\1\11\164\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[199];
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
Lexer(Reader in,TablaSimbolos t){
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
    while (i < 210) {
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
          case 71: break;
          case 2: 
            { lexeme=yytext(); linea=yyline; 
                Simbolo s;
                if((s=tabla.buscar(lexeme))==null)
                    s=tabla.insertar(lexeme);return ID;
            }
          case 72: break;
          case 3: 
            { lexeme=yytext(); linea=yyline; return entero;
            }
          case 73: break;
          case 4: 
            { /* ignore */
            }
          case 74: break;
          case 5: 
            { lexeme=yytext(); linea=yyline; return PARCI;
            }
          case 75: break;
          case 6: 
            { lexeme=yytext();linea=yyline; return ASIG;
            }
          case 76: break;
          case 7: 
            { lexeme=yytext(); linea=yyline; return MENQ;
            }
          case 77: break;
          case 8: 
            { lexeme=yytext(); linea=yyline; return MAYQ;
            }
          case 78: break;
          case 9: 
            { lexeme=yytext(); linea=yyline; return NOT;
            }
          case 79: break;
          case 10: 
            { lexeme=yytext(); linea=yyline; return SUM;
            }
          case 80: break;
          case 11: 
            { lexeme=yytext(); linea=yyline; return MUL;
            }
          case 81: break;
          case 12: 
            { lexeme=yytext(); linea=yyline; return MEN;
            }
          case 82: break;
          case 13: 
            { lexeme=yytext(); linea=yyline; return DIV;
            }
          case 83: break;
          case 14: 
            { lexeme=yytext(); linea=yyline; return PARAB;
            }
          case 84: break;
          case 15: 
            { lexeme=yytext(); linea=yyline; return LLAVAB;
            }
          case 85: break;
          case 16: 
            { lexeme=yytext(); linea=yyline; return LLAVCI;
            }
          case 86: break;
          case 17: 
            { lexeme=yytext(); linea=yyline; return CORAB;
            }
          case 87: break;
          case 18: 
            { lexeme=yytext(); linea=yyline; return CORCI;
            }
          case 88: break;
          case 19: 
            { lexeme=yytext(); linea=yyline; return ENDLN;
            }
          case 89: break;
          case 20: 
            { lexeme=yytext(); linea=yyline; return COMA;
            }
          case 90: break;
          case 21: 
            { lexeme=yytext(); linea=yyline; return IGUAL;
            }
          case 91: break;
          case 22: 
            { lexeme=yytext(); linea=yyline; return MENIQ;
            }
          case 92: break;
          case 23: 
            { lexeme=yytext(); linea=yyline; return MAYIQ;
            }
          case 93: break;
          case 24: 
            { lexeme=yytext(); linea=yyline; return DIF;
            }
          case 94: break;
          case 25: 
            { lexeme=yytext(); linea=yyline; return AND;
            }
          case 95: break;
          case 26: 
            { lexeme=yytext(); linea=yyline; return OR;
            }
          case 96: break;
          case 27: 
            { lexeme=yytext(); linea=yyline; return If;
            }
          case 97: break;
          case 28: 
            { lexeme=yytext(); linea=yyline; return In;
            }
          case 98: break;
          case 29: 
            { lexeme=yytext();linea=yyline;return A0;
            }
          case 99: break;
          case 30: 
            { lexeme=yytext();linea=yyline;return A1;
            }
          case 100: break;
          case 31: 
            { lexeme=yytext();linea=yyline;return A2;
            }
          case 101: break;
          case 32: 
            { lexeme=yytext();linea=yyline;return A3;
            }
          case 102: break;
          case 33: 
            { lexeme=yytext();linea=yyline;return A4;
            }
          case 103: break;
          case 34: 
            { lexeme=yytext(); linea=yyline; return flotante;
            }
          case 104: break;
          case 35: 
            { /*Ignore*/
            }
          case 105: break;
          case 36: 
            { lexeme=yytext(); linea=yyline; return end;
            }
          case 106: break;
          case 37: 
            { lexeme=yytext(); linea=yyline; return For;
            }
          case 107: break;
          case 38: 
            { lexeme=yytext(); linea=yyline; return Int;
            }
          case 108: break;
          case 39: 
            { lexeme=yytext(); linea=yyline; return def;
            }
          case 109: break;
          case 40: 
            { lexeme=yytext(); linea=yyline; return use;
            }
          case 110: break;
          case 41: 
            { lexeme=yytext(); linea=yyline; return Out;
            }
          case 111: break;
          case 42: 
            { lexeme=yytext(); linea=yyline; return read;
            }
          case 112: break;
          case 43: 
            { lexeme=yytext(); linea=yyline; return Else;
            }
          case 113: break;
          case 44: 
            { lexeme=yytext(); linea=yyline; return True;
            }
          case 114: break;
          case 45: 
            { lexeme=yytext(); linea=yyline; return Long;
            }
          case 115: break;
          case 46: 
            { lexeme=yytext(); linea=yyline; return Void;
            }
          case 116: break;
          case 47: 
            { lexeme=yytext(); linea=yyline; return False;
            }
          case 117: break;
          case 48: 
            { lexeme=yytext(); linea=yyline; return Float;
            }
          case 118: break;
          case 49: 
            { lexeme=yytext(); linea=yyline; return begin;
            }
          case 119: break;
          case 50: 
            { lexeme=yytext(); linea=yyline; return small;
            }
          case 120: break;
          case 51: 
            { lexeme=yytext(); linea=yyline; return onLuz;
            }
          case 121: break;
          case 52: 
            { lexeme=yytext(); linea=yyline; return write;
            }
          case 122: break;
          case 53: 
            { lexeme=yytext(); linea=yyline; return valPh;
            }
          case 123: break;
          case 54: 
            { lexeme=yytext(); linea=yyline; return bombPh;
            }
          case 124: break;
          case 55: 
            { lexeme=yytext(); linea=yyline; return onVent;
            }
          case 125: break;
          case 56: 
            { lexeme=yytext(); linea=yyline; return turnOn;
            }
          case 126: break;
          case 57: 
            { lexeme=yytext(); linea=yyline; return humAmb;
            }
          case 127: break;
          case 58: 
            { lexeme=yytext(); linea=yyline; return Boolean;
            }
          case 128: break;
          case 59: 
            { lexeme=yytext(); linea=yyline; return bombaMin;
            }
          case 129: break;
          case 60: 
            { lexeme=yytext(); linea=yyline; return bombDes;
            }
          case 130: break;
          case 61: 
            { lexeme=yytext(); linea=yyline; return digital;
            }
          case 131: break;
          case 62: 
            { lexeme=yytext(); linea=yyline; return turnOff;
            }
          case 132: break;
          case 63: 
            { lexeme=yytext(); linea=yyline; return valIlum;
            }
          case 133: break;
          case 64: 
            { lexeme=yytext(); linea=yyline; return bombAgua;
            }
          case 134: break;
          case 65: 
            { lexeme=yytext(); linea=yyline; return temIdeal;
            }
          case 135: break;
          case 66: 
            { lexeme=yytext(); linea=yyline; return toReturn;
            }
          case 136: break;
          case 67: 
            { lexeme=yytext(); linea=yyline; return analogic;
            }
          case 137: break;
          case 68: 
            { lexeme=yytext(); linea=yyline; return valElect;
            }
          case 138: break;
          case 69: 
            { lexeme=yytext(); linea=yyline; return reference;
            }
          case 139: break;
          case 70: 
            { lexeme=yytext(); linea=yyline; return valMineral;
            }
          case 140: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
