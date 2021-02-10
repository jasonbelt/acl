package org.sireum.aadl.osate.acl.ui.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalACLLexer extends Lexer {
    public static final int LessThanSignGreaterThanSign=33;
    public static final int Or=37;
    public static final int EqualsSignGreaterThanSign=34;
    public static final int True=24;
    public static final int False=21;
    public static final int Periodic=10;
    public static final int LessThanSign=50;
    public static final int RULE_INT_EXPONENT=61;
    public static final int PercentSign=39;
    public static final int Implies=16;
    public static final int PlusSignEqualsSignGreaterThanSign=26;
    public static final int LeftParenthesis=40;
    public static final int FullStopFullStop=30;
    public static final int TracesTo=11;
    public static final int To=38;
    public static final int Applies=13;
    public static final int RULE_BASED_INTEGER=63;
    public static final int RightSquareBracket=54;
    public static final int Binding=14;
    public static final int GreaterThanSign=52;
    public static final int RULE_ID=67;
    public static final int For=28;
    public static final int RightParenthesis=41;
    public static final int RULE_DIGIT=59;
    public static final int GreaterThanSignEqualsSign=35;
    public static final int ColonColon=31;
    public static final int Not=29;
    public static final int Hyperperiod=4;
    public static final int Andthen=12;
    public static final int And=27;
    public static final int PlusSign=43;
    public static final int Assume=18;
    public static final int LeftSquareBracket=53;
    public static final int RULE_INTEGER_LIT=64;
    public static final int In=36;
    public static final int Constant=9;
    public static final int RULE_REAL_LIT=62;
    public static final int RULE_STRING=66;
    public static final int Classifier=5;
    public static final int With=25;
    public static final int RULE_SL_COMMENT=58;
    public static final int Comma=44;
    public static final int EqualsSign=51;
    public static final int HyphenMinus=45;
    public static final int Guarantee=7;
    public static final int LessThanSignEqualsSign=32;
    public static final int Solidus=47;
    public static final int Colon=48;
    public static final int RightCurlyBracket=57;
    public static final int EOF=-1;
    public static final int Asterisk=42;
    public static final int Contracts=6;
    public static final int Fun=17;
    public static final int Modes=23;
    public static final int FullStop=46;
    public static final int RULE_WS=68;
    public static final int Reference=8;
    public static final int Flows=22;
    public static final int LeftCurlyBracket=56;
    public static final int CircumflexAccent=55;
    public static final int Semicolon=49;
    public static final int RULE_EXPONENT=60;
    public static final int Delta=20;
    public static final int Compute=15;
    public static final int Orelse=19;
    public static final int RULE_EXTENDED_DIGIT=65;

    // delegates
    // delegators

    public InternalACLLexer() {;} 
    public InternalACLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalACLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalACLLexer.g"; }

    // $ANTLR start "Hyperperiod"
    public final void mHyperperiod() throws RecognitionException {
        try {
            int _type = Hyperperiod;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:19:13: ( ( 'H' | 'h' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'D' | 'd' ) )
            // InternalACLLexer.g:19:15: ( 'H' | 'h' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Hyperperiod"

    // $ANTLR start "Classifier"
    public final void mClassifier() throws RecognitionException {
        try {
            int _type = Classifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:21:12: ( ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // InternalACLLexer.g:21:14: ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Classifier"

    // $ANTLR start "Contracts"
    public final void mContracts() throws RecognitionException {
        try {
            int _type = Contracts;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:23:11: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'S' | 's' ) )
            // InternalACLLexer.g:23:13: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Contracts"

    // $ANTLR start "Guarantee"
    public final void mGuarantee() throws RecognitionException {
        try {
            int _type = Guarantee;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:25:11: ( ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'E' | 'e' ) )
            // InternalACLLexer.g:25:13: ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Guarantee"

    // $ANTLR start "Reference"
    public final void mReference() throws RecognitionException {
        try {
            int _type = Reference;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:27:11: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' ) )
            // InternalACLLexer.g:27:13: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Reference"

    // $ANTLR start "Constant"
    public final void mConstant() throws RecognitionException {
        try {
            int _type = Constant;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:29:10: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) )
            // InternalACLLexer.g:29:12: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Constant"

    // $ANTLR start "Periodic"
    public final void mPeriodic() throws RecognitionException {
        try {
            int _type = Periodic;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:31:10: ( ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'C' | 'c' ) )
            // InternalACLLexer.g:31:12: ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'C' | 'c' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Periodic"

    // $ANTLR start "TracesTo"
    public final void mTracesTo() throws RecognitionException {
        try {
            int _type = TracesTo;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:33:10: ( ( 'T' | 't' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'O' | 'o' ) )
            // InternalACLLexer.g:33:12: ( 'T' | 't' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TracesTo"

    // $ANTLR start "Andthen"
    public final void mAndthen() throws RecognitionException {
        try {
            int _type = Andthen;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:35:9: ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'T' | 't' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'N' | 'n' ) )
            // InternalACLLexer.g:35:11: ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'T' | 't' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Andthen"

    // $ANTLR start "Applies"
    public final void mApplies() throws RecognitionException {
        try {
            int _type = Applies;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:37:9: ( ( 'A' | 'a' ) ( 'P' | 'p' ) ( 'P' | 'p' ) ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // InternalACLLexer.g:37:11: ( 'A' | 'a' ) ( 'P' | 'p' ) ( 'P' | 'p' ) ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Applies"

    // $ANTLR start "Binding"
    public final void mBinding() throws RecognitionException {
        try {
            int _type = Binding;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:39:9: ( ( 'B' | 'b' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // InternalACLLexer.g:39:11: ( 'B' | 'b' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Binding"

    // $ANTLR start "Compute"
    public final void mCompute() throws RecognitionException {
        try {
            int _type = Compute;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:41:9: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // InternalACLLexer.g:41:11: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Compute"

    // $ANTLR start "Implies"
    public final void mImplies() throws RecognitionException {
        try {
            int _type = Implies;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:43:9: ( ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // InternalACLLexer.g:43:11: ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Implies"

    // $ANTLR start "Fun"
    public final void mFun() throws RecognitionException {
        try {
            int _type = Fun;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:45:5: ( '-' ( 'F' | 'f' ) ( 'U' | 'u' ) ( 'N' | 'n' ) '-' '>' )
            // InternalACLLexer.g:45:7: '-' ( 'F' | 'f' ) ( 'U' | 'u' ) ( 'N' | 'n' ) '-' '>'
            {
            match('-'); 
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('-'); 
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Fun"

    // $ANTLR start "Assume"
    public final void mAssume() throws RecognitionException {
        try {
            int _type = Assume;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:47:8: ( ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'U' | 'u' ) ( 'M' | 'm' ) ( 'E' | 'e' ) )
            // InternalACLLexer.g:47:10: ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'U' | 'u' ) ( 'M' | 'm' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Assume"

    // $ANTLR start "Orelse"
    public final void mOrelse() throws RecognitionException {
        try {
            int _type = Orelse;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:49:8: ( ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // InternalACLLexer.g:49:10: ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Orelse"

    // $ANTLR start "Delta"
    public final void mDelta() throws RecognitionException {
        try {
            int _type = Delta;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:51:7: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'T' | 't' ) ( 'A' | 'a' ) )
            // InternalACLLexer.g:51:9: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'T' | 't' ) ( 'A' | 'a' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Delta"

    // $ANTLR start "False"
    public final void mFalse() throws RecognitionException {
        try {
            int _type = False;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:53:7: ( ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // InternalACLLexer.g:53:9: ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "False"

    // $ANTLR start "Flows"
    public final void mFlows() throws RecognitionException {
        try {
            int _type = Flows;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:55:7: ( ( 'F' | 'f' ) ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'W' | 'w' ) ( 'S' | 's' ) )
            // InternalACLLexer.g:55:9: ( 'F' | 'f' ) ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'W' | 'w' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Flows"

    // $ANTLR start "Modes"
    public final void mModes() throws RecognitionException {
        try {
            int _type = Modes;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:57:7: ( ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // InternalACLLexer.g:57:9: ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Modes"

    // $ANTLR start "True"
    public final void mTrue() throws RecognitionException {
        try {
            int _type = True;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:59:6: ( ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' ) )
            // InternalACLLexer.g:59:8: ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "True"

    // $ANTLR start "With"
    public final void mWith() throws RecognitionException {
        try {
            int _type = With;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:61:6: ( ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'H' | 'h' ) )
            // InternalACLLexer.g:61:8: ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'H' | 'h' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "With"

    // $ANTLR start "PlusSignEqualsSignGreaterThanSign"
    public final void mPlusSignEqualsSignGreaterThanSign() throws RecognitionException {
        try {
            int _type = PlusSignEqualsSignGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:63:35: ( '+' '=' '>' )
            // InternalACLLexer.g:63:37: '+' '=' '>'
            {
            match('+'); 
            match('='); 
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PlusSignEqualsSignGreaterThanSign"

    // $ANTLR start "And"
    public final void mAnd() throws RecognitionException {
        try {
            int _type = And;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:65:5: ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // InternalACLLexer.g:65:7: ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "And"

    // $ANTLR start "For"
    public final void mFor() throws RecognitionException {
        try {
            int _type = For;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:67:5: ( ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // InternalACLLexer.g:67:7: ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "For"

    // $ANTLR start "Not"
    public final void mNot() throws RecognitionException {
        try {
            int _type = Not;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:69:5: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' ) )
            // InternalACLLexer.g:69:7: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Not"

    // $ANTLR start "FullStopFullStop"
    public final void mFullStopFullStop() throws RecognitionException {
        try {
            int _type = FullStopFullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:71:18: ( '.' '.' )
            // InternalACLLexer.g:71:20: '.' '.'
            {
            match('.'); 
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStopFullStop"

    // $ANTLR start "ColonColon"
    public final void mColonColon() throws RecognitionException {
        try {
            int _type = ColonColon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:73:12: ( ':' ':' )
            // InternalACLLexer.g:73:14: ':' ':'
            {
            match(':'); 
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ColonColon"

    // $ANTLR start "LessThanSignEqualsSign"
    public final void mLessThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = LessThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:75:24: ( '<' '=' )
            // InternalACLLexer.g:75:26: '<' '='
            {
            match('<'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSignEqualsSign"

    // $ANTLR start "LessThanSignGreaterThanSign"
    public final void mLessThanSignGreaterThanSign() throws RecognitionException {
        try {
            int _type = LessThanSignGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:77:29: ( '<' '>' )
            // InternalACLLexer.g:77:31: '<' '>'
            {
            match('<'); 
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSignGreaterThanSign"

    // $ANTLR start "EqualsSignGreaterThanSign"
    public final void mEqualsSignGreaterThanSign() throws RecognitionException {
        try {
            int _type = EqualsSignGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:79:27: ( '=' '>' )
            // InternalACLLexer.g:79:29: '=' '>'
            {
            match('='); 
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSignGreaterThanSign"

    // $ANTLR start "GreaterThanSignEqualsSign"
    public final void mGreaterThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = GreaterThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:81:27: ( '>' '=' )
            // InternalACLLexer.g:81:29: '>' '='
            {
            match('>'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSignEqualsSign"

    // $ANTLR start "In"
    public final void mIn() throws RecognitionException {
        try {
            int _type = In;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:83:4: ( ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // InternalACLLexer.g:83:6: ( 'I' | 'i' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "In"

    // $ANTLR start "Or"
    public final void mOr() throws RecognitionException {
        try {
            int _type = Or;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:85:4: ( ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // InternalACLLexer.g:85:6: ( 'O' | 'o' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Or"

    // $ANTLR start "To"
    public final void mTo() throws RecognitionException {
        try {
            int _type = To;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:87:4: ( ( 'T' | 't' ) ( 'O' | 'o' ) )
            // InternalACLLexer.g:87:6: ( 'T' | 't' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "To"

    // $ANTLR start "PercentSign"
    public final void mPercentSign() throws RecognitionException {
        try {
            int _type = PercentSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:89:13: ( '%' )
            // InternalACLLexer.g:89:15: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PercentSign"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:91:17: ( '(' )
            // InternalACLLexer.g:91:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftParenthesis"

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:93:18: ( ')' )
            // InternalACLLexer.g:93:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightParenthesis"

    // $ANTLR start "Asterisk"
    public final void mAsterisk() throws RecognitionException {
        try {
            int _type = Asterisk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:95:10: ( '*' )
            // InternalACLLexer.g:95:12: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Asterisk"

    // $ANTLR start "PlusSign"
    public final void mPlusSign() throws RecognitionException {
        try {
            int _type = PlusSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:97:10: ( '+' )
            // InternalACLLexer.g:97:12: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PlusSign"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:99:7: ( ',' )
            // InternalACLLexer.g:99:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "HyphenMinus"
    public final void mHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:101:13: ( '-' )
            // InternalACLLexer.g:101:15: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinus"

    // $ANTLR start "FullStop"
    public final void mFullStop() throws RecognitionException {
        try {
            int _type = FullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:103:10: ( '.' )
            // InternalACLLexer.g:103:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStop"

    // $ANTLR start "Solidus"
    public final void mSolidus() throws RecognitionException {
        try {
            int _type = Solidus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:105:9: ( '/' )
            // InternalACLLexer.g:105:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Solidus"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:107:7: ( ':' )
            // InternalACLLexer.g:107:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "Semicolon"
    public final void mSemicolon() throws RecognitionException {
        try {
            int _type = Semicolon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:109:11: ( ';' )
            // InternalACLLexer.g:109:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Semicolon"

    // $ANTLR start "LessThanSign"
    public final void mLessThanSign() throws RecognitionException {
        try {
            int _type = LessThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:111:14: ( '<' )
            // InternalACLLexer.g:111:16: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSign"

    // $ANTLR start "EqualsSign"
    public final void mEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:113:12: ( '=' )
            // InternalACLLexer.g:113:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSign"

    // $ANTLR start "GreaterThanSign"
    public final void mGreaterThanSign() throws RecognitionException {
        try {
            int _type = GreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:115:17: ( '>' )
            // InternalACLLexer.g:115:19: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSign"

    // $ANTLR start "LeftSquareBracket"
    public final void mLeftSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:117:19: ( '[' )
            // InternalACLLexer.g:117:21: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftSquareBracket"

    // $ANTLR start "RightSquareBracket"
    public final void mRightSquareBracket() throws RecognitionException {
        try {
            int _type = RightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:119:20: ( ']' )
            // InternalACLLexer.g:119:22: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightSquareBracket"

    // $ANTLR start "CircumflexAccent"
    public final void mCircumflexAccent() throws RecognitionException {
        try {
            int _type = CircumflexAccent;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:121:18: ( '^' )
            // InternalACLLexer.g:121:20: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CircumflexAccent"

    // $ANTLR start "LeftCurlyBracket"
    public final void mLeftCurlyBracket() throws RecognitionException {
        try {
            int _type = LeftCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:123:18: ( '{' )
            // InternalACLLexer.g:123:20: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftCurlyBracket"

    // $ANTLR start "RightCurlyBracket"
    public final void mRightCurlyBracket() throws RecognitionException {
        try {
            int _type = RightCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:125:19: ( '}' )
            // InternalACLLexer.g:125:21: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightCurlyBracket"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:129:17: ( '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalACLLexer.g:129:19: '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("--"); 

            // InternalACLLexer.g:129:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalACLLexer.g:129:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalACLLexer.g:129:40: ( ( '\\r' )? '\\n' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalACLLexer.g:129:41: ( '\\r' )? '\\n'
                    {
                    // InternalACLLexer.g:129:41: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalACLLexer.g:129:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_EXPONENT"
    public final void mRULE_EXPONENT() throws RecognitionException {
        try {
            // InternalACLLexer.g:131:24: ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+ )
            // InternalACLLexer.g:131:26: ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalACLLexer.g:131:36: ( '+' | '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='+'||LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalACLLexer.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // InternalACLLexer.g:131:47: ( RULE_DIGIT )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalACLLexer.g:131:47: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPONENT"

    // $ANTLR start "RULE_INT_EXPONENT"
    public final void mRULE_INT_EXPONENT() throws RecognitionException {
        try {
            // InternalACLLexer.g:133:28: ( ( 'e' | 'E' ) ( '+' )? ( RULE_DIGIT )+ )
            // InternalACLLexer.g:133:30: ( 'e' | 'E' ) ( '+' )? ( RULE_DIGIT )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalACLLexer.g:133:40: ( '+' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='+') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalACLLexer.g:133:40: '+'
                    {
                    match('+'); 

                    }
                    break;

            }

            // InternalACLLexer.g:133:45: ( RULE_DIGIT )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalACLLexer.g:133:45: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT_EXPONENT"

    // $ANTLR start "RULE_REAL_LIT"
    public final void mRULE_REAL_LIT() throws RecognitionException {
        try {
            int _type = RULE_REAL_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:135:15: ( ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* '.' ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( RULE_EXPONENT )? )
            // InternalACLLexer.g:135:17: ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* '.' ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( RULE_EXPONENT )?
            {
            // InternalACLLexer.g:135:17: ( RULE_DIGIT )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalACLLexer.g:135:17: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            // InternalACLLexer.g:135:29: ( '_' ( RULE_DIGIT )+ )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='_') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalACLLexer.g:135:30: '_' ( RULE_DIGIT )+
            	    {
            	    match('_'); 
            	    // InternalACLLexer.g:135:34: ( RULE_DIGIT )+
            	    int cnt9=0;
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalACLLexer.g:135:34: RULE_DIGIT
            	    	    {
            	    	    mRULE_DIGIT(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt9 >= 1 ) break loop9;
            	                EarlyExitException eee =
            	                    new EarlyExitException(9, input);
            	                throw eee;
            	        }
            	        cnt9++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match('.'); 
            // InternalACLLexer.g:135:52: ( RULE_DIGIT )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalACLLexer.g:135:52: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            // InternalACLLexer.g:135:64: ( '_' ( RULE_DIGIT )+ )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='_') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalACLLexer.g:135:65: '_' ( RULE_DIGIT )+
            	    {
            	    match('_'); 
            	    // InternalACLLexer.g:135:69: ( RULE_DIGIT )+
            	    int cnt12=0;
            	    loop12:
            	    do {
            	        int alt12=2;
            	        int LA12_0 = input.LA(1);

            	        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            	            alt12=1;
            	        }


            	        switch (alt12) {
            	    	case 1 :
            	    	    // InternalACLLexer.g:135:69: RULE_DIGIT
            	    	    {
            	    	    mRULE_DIGIT(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt12 >= 1 ) break loop12;
            	                EarlyExitException eee =
            	                    new EarlyExitException(12, input);
            	                throw eee;
            	        }
            	        cnt12++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalACLLexer.g:135:83: ( RULE_EXPONENT )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='E'||LA14_0=='e') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalACLLexer.g:135:83: RULE_EXPONENT
                    {
                    mRULE_EXPONENT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REAL_LIT"

    // $ANTLR start "RULE_INTEGER_LIT"
    public final void mRULE_INTEGER_LIT() throws RecognitionException {
        try {
            int _type = RULE_INTEGER_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:137:18: ( ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )? | ( RULE_INT_EXPONENT )? ) )
            // InternalACLLexer.g:137:20: ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )? | ( RULE_INT_EXPONENT )? )
            {
            // InternalACLLexer.g:137:20: ( RULE_DIGIT )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalACLLexer.g:137:20: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            // InternalACLLexer.g:137:32: ( '_' ( RULE_DIGIT )+ )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='_') ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalACLLexer.g:137:33: '_' ( RULE_DIGIT )+
            	    {
            	    match('_'); 
            	    // InternalACLLexer.g:137:37: ( RULE_DIGIT )+
            	    int cnt16=0;
            	    loop16:
            	    do {
            	        int alt16=2;
            	        int LA16_0 = input.LA(1);

            	        if ( ((LA16_0>='0' && LA16_0<='9')) ) {
            	            alt16=1;
            	        }


            	        switch (alt16) {
            	    	case 1 :
            	    	    // InternalACLLexer.g:137:37: RULE_DIGIT
            	    	    {
            	    	    mRULE_DIGIT(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt16 >= 1 ) break loop16;
            	                EarlyExitException eee =
            	                    new EarlyExitException(16, input);
            	                throw eee;
            	        }
            	        cnt16++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalACLLexer.g:137:51: ( '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )? | ( RULE_INT_EXPONENT )? )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='#') ) {
                alt20=1;
            }
            else {
                alt20=2;}
            switch (alt20) {
                case 1 :
                    // InternalACLLexer.g:137:52: '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )?
                    {
                    match('#'); 
                    mRULE_BASED_INTEGER(); 
                    match('#'); 
                    // InternalACLLexer.g:137:79: ( RULE_INT_EXPONENT )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='E'||LA18_0=='e') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalACLLexer.g:137:79: RULE_INT_EXPONENT
                            {
                            mRULE_INT_EXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalACLLexer.g:137:98: ( RULE_INT_EXPONENT )?
                    {
                    // InternalACLLexer.g:137:98: ( RULE_INT_EXPONENT )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='E'||LA19_0=='e') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalACLLexer.g:137:98: RULE_INT_EXPONENT
                            {
                            mRULE_INT_EXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGER_LIT"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalACLLexer.g:139:21: ( '0' .. '9' )
            // InternalACLLexer.g:139:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_EXTENDED_DIGIT"
    public final void mRULE_EXTENDED_DIGIT() throws RecognitionException {
        try {
            // InternalACLLexer.g:141:30: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // InternalACLLexer.g:141:32: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXTENDED_DIGIT"

    // $ANTLR start "RULE_BASED_INTEGER"
    public final void mRULE_BASED_INTEGER() throws RecognitionException {
        try {
            // InternalACLLexer.g:143:29: ( RULE_EXTENDED_DIGIT ( ( '_' )? RULE_EXTENDED_DIGIT )* )
            // InternalACLLexer.g:143:31: RULE_EXTENDED_DIGIT ( ( '_' )? RULE_EXTENDED_DIGIT )*
            {
            mRULE_EXTENDED_DIGIT(); 
            // InternalACLLexer.g:143:51: ( ( '_' )? RULE_EXTENDED_DIGIT )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='0' && LA22_0<='9')||(LA22_0>='A' && LA22_0<='F')||LA22_0=='_'||(LA22_0>='a' && LA22_0<='f')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalACLLexer.g:143:52: ( '_' )? RULE_EXTENDED_DIGIT
            	    {
            	    // InternalACLLexer.g:143:52: ( '_' )?
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0=='_') ) {
            	        alt21=1;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalACLLexer.g:143:52: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    mRULE_EXTENDED_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BASED_INTEGER"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:145:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalACLLexer.g:145:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalACLLexer.g:145:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='\"') ) {
                alt25=1;
            }
            else if ( (LA25_0=='\'') ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalACLLexer.g:145:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalACLLexer.g:145:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop23:
                    do {
                        int alt23=3;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0=='\\') ) {
                            alt23=1;
                        }
                        else if ( ((LA23_0>='\u0000' && LA23_0<='!')||(LA23_0>='#' && LA23_0<='[')||(LA23_0>=']' && LA23_0<='\uFFFF')) ) {
                            alt23=2;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalACLLexer.g:145:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalACLLexer.g:145:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalACLLexer.g:145:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalACLLexer.g:145:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop24:
                    do {
                        int alt24=3;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0=='\\') ) {
                            alt24=1;
                        }
                        else if ( ((LA24_0>='\u0000' && LA24_0<='&')||(LA24_0>='(' && LA24_0<='[')||(LA24_0>=']' && LA24_0<='\uFFFF')) ) {
                            alt24=2;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalACLLexer.g:145:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalACLLexer.g:145:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:147:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( '_' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )* )
            // InternalACLLexer.g:147:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( '_' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalACLLexer.g:147:31: ( ( '_' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>='0' && LA27_0<='9')||(LA27_0>='A' && LA27_0<='Z')||LA27_0=='_'||(LA27_0>='a' && LA27_0<='z')) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalACLLexer.g:147:32: ( '_' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )
            	    {
            	    // InternalACLLexer.g:147:32: ( '_' )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0=='_') ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // InternalACLLexer.g:147:32: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACLLexer.g:149:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalACLLexer.g:149:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalACLLexer.g:149:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>='\t' && LA28_0<='\n')||LA28_0=='\r'||LA28_0==' ') ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalACLLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // InternalACLLexer.g:1:8: ( Hyperperiod | Classifier | Contracts | Guarantee | Reference | Constant | Periodic | TracesTo | Andthen | Applies | Binding | Compute | Implies | Fun | Assume | Orelse | Delta | False | Flows | Modes | True | With | PlusSignEqualsSignGreaterThanSign | And | For | Not | FullStopFullStop | ColonColon | LessThanSignEqualsSign | LessThanSignGreaterThanSign | EqualsSignGreaterThanSign | GreaterThanSignEqualsSign | In | Or | To | PercentSign | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | Semicolon | LessThanSign | EqualsSign | GreaterThanSign | LeftSquareBracket | RightSquareBracket | CircumflexAccent | LeftCurlyBracket | RightCurlyBracket | RULE_SL_COMMENT | RULE_REAL_LIT | RULE_INTEGER_LIT | RULE_STRING | RULE_ID | RULE_WS )
        int alt29=60;
        alt29 = dfa29.predict(input);
        switch (alt29) {
            case 1 :
                // InternalACLLexer.g:1:10: Hyperperiod
                {
                mHyperperiod(); 

                }
                break;
            case 2 :
                // InternalACLLexer.g:1:22: Classifier
                {
                mClassifier(); 

                }
                break;
            case 3 :
                // InternalACLLexer.g:1:33: Contracts
                {
                mContracts(); 

                }
                break;
            case 4 :
                // InternalACLLexer.g:1:43: Guarantee
                {
                mGuarantee(); 

                }
                break;
            case 5 :
                // InternalACLLexer.g:1:53: Reference
                {
                mReference(); 

                }
                break;
            case 6 :
                // InternalACLLexer.g:1:63: Constant
                {
                mConstant(); 

                }
                break;
            case 7 :
                // InternalACLLexer.g:1:72: Periodic
                {
                mPeriodic(); 

                }
                break;
            case 8 :
                // InternalACLLexer.g:1:81: TracesTo
                {
                mTracesTo(); 

                }
                break;
            case 9 :
                // InternalACLLexer.g:1:90: Andthen
                {
                mAndthen(); 

                }
                break;
            case 10 :
                // InternalACLLexer.g:1:98: Applies
                {
                mApplies(); 

                }
                break;
            case 11 :
                // InternalACLLexer.g:1:106: Binding
                {
                mBinding(); 

                }
                break;
            case 12 :
                // InternalACLLexer.g:1:114: Compute
                {
                mCompute(); 

                }
                break;
            case 13 :
                // InternalACLLexer.g:1:122: Implies
                {
                mImplies(); 

                }
                break;
            case 14 :
                // InternalACLLexer.g:1:130: Fun
                {
                mFun(); 

                }
                break;
            case 15 :
                // InternalACLLexer.g:1:134: Assume
                {
                mAssume(); 

                }
                break;
            case 16 :
                // InternalACLLexer.g:1:141: Orelse
                {
                mOrelse(); 

                }
                break;
            case 17 :
                // InternalACLLexer.g:1:148: Delta
                {
                mDelta(); 

                }
                break;
            case 18 :
                // InternalACLLexer.g:1:154: False
                {
                mFalse(); 

                }
                break;
            case 19 :
                // InternalACLLexer.g:1:160: Flows
                {
                mFlows(); 

                }
                break;
            case 20 :
                // InternalACLLexer.g:1:166: Modes
                {
                mModes(); 

                }
                break;
            case 21 :
                // InternalACLLexer.g:1:172: True
                {
                mTrue(); 

                }
                break;
            case 22 :
                // InternalACLLexer.g:1:177: With
                {
                mWith(); 

                }
                break;
            case 23 :
                // InternalACLLexer.g:1:182: PlusSignEqualsSignGreaterThanSign
                {
                mPlusSignEqualsSignGreaterThanSign(); 

                }
                break;
            case 24 :
                // InternalACLLexer.g:1:216: And
                {
                mAnd(); 

                }
                break;
            case 25 :
                // InternalACLLexer.g:1:220: For
                {
                mFor(); 

                }
                break;
            case 26 :
                // InternalACLLexer.g:1:224: Not
                {
                mNot(); 

                }
                break;
            case 27 :
                // InternalACLLexer.g:1:228: FullStopFullStop
                {
                mFullStopFullStop(); 

                }
                break;
            case 28 :
                // InternalACLLexer.g:1:245: ColonColon
                {
                mColonColon(); 

                }
                break;
            case 29 :
                // InternalACLLexer.g:1:256: LessThanSignEqualsSign
                {
                mLessThanSignEqualsSign(); 

                }
                break;
            case 30 :
                // InternalACLLexer.g:1:279: LessThanSignGreaterThanSign
                {
                mLessThanSignGreaterThanSign(); 

                }
                break;
            case 31 :
                // InternalACLLexer.g:1:307: EqualsSignGreaterThanSign
                {
                mEqualsSignGreaterThanSign(); 

                }
                break;
            case 32 :
                // InternalACLLexer.g:1:333: GreaterThanSignEqualsSign
                {
                mGreaterThanSignEqualsSign(); 

                }
                break;
            case 33 :
                // InternalACLLexer.g:1:359: In
                {
                mIn(); 

                }
                break;
            case 34 :
                // InternalACLLexer.g:1:362: Or
                {
                mOr(); 

                }
                break;
            case 35 :
                // InternalACLLexer.g:1:365: To
                {
                mTo(); 

                }
                break;
            case 36 :
                // InternalACLLexer.g:1:368: PercentSign
                {
                mPercentSign(); 

                }
                break;
            case 37 :
                // InternalACLLexer.g:1:380: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 38 :
                // InternalACLLexer.g:1:396: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 39 :
                // InternalACLLexer.g:1:413: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 40 :
                // InternalACLLexer.g:1:422: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 41 :
                // InternalACLLexer.g:1:431: Comma
                {
                mComma(); 

                }
                break;
            case 42 :
                // InternalACLLexer.g:1:437: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 43 :
                // InternalACLLexer.g:1:449: FullStop
                {
                mFullStop(); 

                }
                break;
            case 44 :
                // InternalACLLexer.g:1:458: Solidus
                {
                mSolidus(); 

                }
                break;
            case 45 :
                // InternalACLLexer.g:1:466: Colon
                {
                mColon(); 

                }
                break;
            case 46 :
                // InternalACLLexer.g:1:472: Semicolon
                {
                mSemicolon(); 

                }
                break;
            case 47 :
                // InternalACLLexer.g:1:482: LessThanSign
                {
                mLessThanSign(); 

                }
                break;
            case 48 :
                // InternalACLLexer.g:1:495: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 49 :
                // InternalACLLexer.g:1:506: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 50 :
                // InternalACLLexer.g:1:522: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 51 :
                // InternalACLLexer.g:1:540: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 52 :
                // InternalACLLexer.g:1:559: CircumflexAccent
                {
                mCircumflexAccent(); 

                }
                break;
            case 53 :
                // InternalACLLexer.g:1:576: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 54 :
                // InternalACLLexer.g:1:593: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 55 :
                // InternalACLLexer.g:1:611: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 56 :
                // InternalACLLexer.g:1:627: RULE_REAL_LIT
                {
                mRULE_REAL_LIT(); 

                }
                break;
            case 57 :
                // InternalACLLexer.g:1:641: RULE_INTEGER_LIT
                {
                mRULE_INTEGER_LIT(); 

                }
                break;
            case 58 :
                // InternalACLLexer.g:1:658: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 59 :
                // InternalACLLexer.g:1:670: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 60 :
                // InternalACLLexer.g:1:678: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA29 dfa29 = new DFA29(this);
    static final String DFA29_eotS =
        "\1\uffff\11\45\1\67\5\45\1\100\1\45\1\103\1\105\1\110\1\112\1\114\14\uffff\1\115\3\uffff\7\45\1\131\5\45\1\137\3\uffff\1\141\6\45\2\uffff\1\45\16\uffff\11\45\1\uffff\1\165\4\45\1\uffff\1\45\1\uffff\3\45\1\176\2\45\1\u0081\1\115\11\45\1\u008b\1\45\1\uffff\10\45\1\uffff\1\45\1\u0096\1\uffff\11\45\1\uffff\6\45\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\uffff\13\45\1\u00b5\2\45\1\u00b8\4\uffff\4\45\1\u00bd\4\45\1\u00c2\1\u00c3\1\uffff\1\u00c4\1\u00c5\1\uffff\3\45\1\u00c9\1\uffff\2\45\1\u00cc\1\u00cd\4\uffff\2\45\1\u00d0\1\uffff\1\u00d1\1\u00d2\2\uffff\1\45\1\u00d4\3\uffff\1\u00d5\2\uffff";
    static final String DFA29_eofS =
        "\u00d6\uffff";
    static final String DFA29_minS =
        "\1\11\1\131\1\114\1\125\2\105\1\117\1\116\1\111\1\115\1\55\1\122\1\105\1\101\1\117\1\111\1\75\1\117\1\56\1\72\1\75\1\76\1\75\14\uffff\1\56\3\uffff\1\120\1\101\1\115\1\101\1\106\1\122\1\101\1\60\1\104\1\120\1\123\1\116\1\120\1\60\3\uffff\1\60\2\114\1\117\1\122\1\104\1\124\2\uffff\1\124\14\uffff\1\60\1\uffff\1\105\2\123\1\120\1\122\1\105\1\111\1\103\1\105\1\uffff\1\60\1\114\1\125\1\104\1\114\1\uffff\1\114\1\uffff\1\124\1\123\1\127\1\60\1\105\1\110\1\60\1\56\1\122\1\123\1\122\1\124\1\125\1\101\1\122\1\117\1\105\1\60\1\110\1\uffff\1\111\1\115\2\111\1\123\1\101\1\105\1\123\1\uffff\1\123\1\60\1\uffff\1\120\1\111\2\101\1\124\1\116\1\105\1\104\1\123\1\uffff\3\105\1\116\2\105\4\60\1\uffff\1\105\1\106\1\103\1\116\1\105\1\124\1\116\1\111\1\124\1\116\1\123\1\60\1\107\1\123\1\60\4\uffff\1\122\1\111\2\124\1\60\1\105\2\103\1\117\2\60\1\uffff\2\60\1\uffff\1\111\1\105\1\123\1\60\1\uffff\2\105\2\60\4\uffff\1\117\1\122\1\60\1\uffff\2\60\2\uffff\1\104\1\60\3\uffff\1\60\2\uffff";
    static final String DFA29_maxS =
        "\1\175\1\171\1\157\1\165\2\145\1\162\1\163\1\151\1\156\1\146\1\162\1\145\2\157\1\151\1\75\1\157\1\56\1\72\2\76\1\75\14\uffff\1\137\3\uffff\1\160\1\141\1\156\1\141\1\146\1\162\1\165\1\172\1\144\1\160\1\163\1\156\1\160\1\172\3\uffff\1\172\2\154\1\157\1\162\1\144\1\164\2\uffff\1\164\14\uffff\1\71\1\uffff\1\145\1\163\1\164\1\160\1\162\1\145\1\151\1\143\1\145\1\uffff\1\172\1\154\1\165\1\144\1\154\1\uffff\1\154\1\uffff\1\164\1\163\1\167\1\172\1\145\1\150\1\172\1\137\1\162\1\163\1\162\1\164\1\165\1\141\1\162\1\157\1\145\1\172\1\150\1\uffff\1\151\1\155\2\151\1\163\1\141\1\145\1\163\1\uffff\1\163\1\172\1\uffff\1\160\1\151\2\141\1\164\1\156\1\145\1\144\1\163\1\uffff\3\145\1\156\2\145\4\172\1\uffff\1\145\1\146\1\143\1\156\1\145\1\164\1\156\1\151\1\164\1\156\1\163\1\172\1\147\1\163\1\172\4\uffff\1\162\1\151\2\164\1\172\1\145\2\143\1\157\2\172\1\uffff\2\172\1\uffff\1\151\1\145\1\163\1\172\1\uffff\2\145\2\172\4\uffff\1\157\1\162\1\172\1\uffff\2\172\2\uffff\1\144\1\172\3\uffff\1\172\2\uffff";
    static final String DFA29_acceptS =
        "\27\uffff\1\44\1\45\1\46\1\47\1\51\1\54\1\56\1\62\1\63\1\64\1\65\1\66\1\uffff\1\72\1\73\1\74\16\uffff\1\16\1\67\1\52\7\uffff\1\27\1\50\1\uffff\1\33\1\53\1\34\1\55\1\35\1\36\1\57\1\37\1\60\1\40\1\61\1\71\1\uffff\1\70\11\uffff\1\43\5\uffff\1\41\1\uffff\1\42\23\uffff\1\30\10\uffff\1\31\2\uffff\1\32\11\uffff\1\25\12\uffff\1\26\17\uffff\1\21\1\22\1\23\1\24\13\uffff\1\17\2\uffff\1\20\4\uffff\1\14\4\uffff\1\11\1\12\1\13\1\15\3\uffff\1\6\2\uffff\1\7\1\10\2\uffff\1\3\1\4\1\5\1\uffff\1\2\1\1";
    static final String DFA29_specialS =
        "\u00d6\uffff}>";
    static final String[] DFA29_transitionS = DFA29_transitionS_.DFA29_transitionS;
    private static final class DFA29_transitionS_ {
        static final String[] DFA29_transitionS = {
                "\2\46\2\uffff\1\46\22\uffff\1\46\1\uffff\1\44\2\uffff\1\27\1\uffff\1\44\1\30\1\31\1\32\1\20\1\33\1\12\1\22\1\34\12\43\1\23\1\35\1\24\1\25\1\26\2\uffff\1\7\1\10\1\2\1\14\1\45\1\15\1\3\1\1\1\11\3\45\1\16\1\21\1\13\1\5\1\45\1\4\1\45\1\6\2\45\1\17\3\45\1\36\1\uffff\1\37\1\40\2\uffff\1\7\1\10\1\2\1\14\1\45\1\15\1\3\1\1\1\11\3\45\1\16\1\21\1\13\1\5\1\45\1\4\1\45\1\6\2\45\1\17\3\45\1\41\1\uffff\1\42",
                "\1\47\37\uffff\1\47",
                "\1\50\2\uffff\1\51\34\uffff\1\50\2\uffff\1\51",
                "\1\52\37\uffff\1\52",
                "\1\53\37\uffff\1\53",
                "\1\54\37\uffff\1\54",
                "\1\56\2\uffff\1\55\34\uffff\1\56\2\uffff\1\55",
                "\1\57\1\uffff\1\60\2\uffff\1\61\32\uffff\1\57\1\uffff\1\60\2\uffff\1\61",
                "\1\62\37\uffff\1\62",
                "\1\63\1\64\36\uffff\1\63\1\64",
                "\1\66\30\uffff\1\65\37\uffff\1\65",
                "\1\70\37\uffff\1\70",
                "\1\71\37\uffff\1\71",
                "\1\72\12\uffff\1\73\2\uffff\1\74\21\uffff\1\72\12\uffff\1\73\2\uffff\1\74",
                "\1\75\37\uffff\1\75",
                "\1\76\37\uffff\1\76",
                "\1\77",
                "\1\101\37\uffff\1\101",
                "\1\102",
                "\1\104",
                "\1\106\1\107",
                "\1\111",
                "\1\113",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "\1\117\1\uffff\12\43\45\uffff\1\116",
                "",
                "",
                "",
                "\1\120\37\uffff\1\120",
                "\1\121\37\uffff\1\121",
                "\1\123\1\122\36\uffff\1\123\1\122",
                "\1\124\37\uffff\1\124",
                "\1\125\37\uffff\1\125",
                "\1\126\37\uffff\1\126",
                "\1\127\23\uffff\1\130\13\uffff\1\127\23\uffff\1\130",
                "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
                "\1\132\37\uffff\1\132",
                "\1\133\37\uffff\1\133",
                "\1\134\37\uffff\1\134",
                "\1\135\37\uffff\1\135",
                "\1\136\37\uffff\1\136",
                "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
                "",
                "",
                "",
                "\12\45\7\uffff\4\45\1\140\25\45\4\uffff\1\45\1\uffff\4\45\1\140\25\45",
                "\1\142\37\uffff\1\142",
                "\1\143\37\uffff\1\143",
                "\1\144\37\uffff\1\144",
                "\1\145\37\uffff\1\145",
                "\1\146\37\uffff\1\146",
                "\1\147\37\uffff\1\147",
                "",
                "",
                "\1\150\37\uffff\1\150",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "\12\151",
                "",
                "\1\152\37\uffff\1\152",
                "\1\153\37\uffff\1\153",
                "\1\155\1\154\36\uffff\1\155\1\154",
                "\1\156\37\uffff\1\156",
                "\1\157\37\uffff\1\157",
                "\1\160\37\uffff\1\160",
                "\1\161\37\uffff\1\161",
                "\1\162\37\uffff\1\162",
                "\1\163\37\uffff\1\163",
                "",
                "\12\45\7\uffff\23\45\1\164\6\45\4\uffff\1\45\1\uffff\23\45\1\164\6\45",
                "\1\166\37\uffff\1\166",
                "\1\167\37\uffff\1\167",
                "\1\170\37\uffff\1\170",
                "\1\171\37\uffff\1\171",
                "",
                "\1\172\37\uffff\1\172",
                "",
                "\1\173\37\uffff\1\173",
                "\1\174\37\uffff\1\174",
                "\1\175\37\uffff\1\175",
                "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
                "\1\177\37\uffff\1\177",
                "\1\u0080\37\uffff\1\u0080",
                "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
                "\1\117\1\uffff\12\151\45\uffff\1\116",
                "\1\u0082\37\uffff\1\u0082",
                "\1\u0083\37\uffff\1\u0083",
                "\1\u0084\37\uffff\1\u0084",
                "\1\u0085\37\uffff\1\u0085",
                "\1\u0086\37\uffff\1\u0086",
                "\1\u0087\37\uffff\1\u0087",
                "\1\u0088\37\uffff\1\u0088",
                "\1\u0089\37\uffff\1\u0089",
                "\1\u008a\37\uffff\1\u008a",
                "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
                "\1\u008c\37\uffff\1\u008c",
                "",
                "\1\u008d\37\uffff\1\u008d",
                "\1\u008e\37\uffff\1\u008e",
                "\1\u008f\37\uffff\1\u008f",
                "\1\u0090\37\uffff\1\u0090",
                "\1\u0091\37\uffff\1\u0091",
                "\1\u0092\37\uffff\1\u0092",
                "\1\u0093\37\uffff\1\u0093",
                "\1\u0094\37\uffff\1\u0094",
                "",
                "\1\u0095\37\uffff\1\u0095",
                "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
                "",
                "\1\u0097\37\uffff\1\u0097",
                "\1\u0098\37\uffff\1\u0098",
                "\1\u0099\37\uffff\1\u0099",
                "\1\u009a\37\uffff\1\u009a",
                "\1\u009b\37\uffff\1\u009b",
                "\1\u009c\37\uffff\1\u009c",
                "\1\u009d\37\uffff\1\u009d",
                "\1\u009e\37\uffff\1\u009e",
                "\1\u009f\37\uffff\1\u009f",
                "",
                "\1\u00a0\37\uffff\1\u00a0",
                "\1\u00a1\37\uffff\1\u00a1",
                "\1\u00a2\37\uffff\1\u00a2",
                "\1\u00a3\37\uffff\1\u00a3",
                "\1\u00a4\37\uffff\1\u00a4",
                "\1\u00a5\37\uffff\1\u00a5",
                "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
                "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
                "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
                "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
                "",
                "\1\u00aa\37\uffff\1\u00aa",
                "\1\u00ab\37\uffff\1\u00ab",
                "\1\u00ac\37\uffff\1\u00ac",
                "\1\u00ad\37\uffff\1\u00ad",
                "\1\u00ae\37\uffff\1\u00ae",
                "\1\u00af\37\uffff\1\u00af",
                "\1\u00b0\37\uffff\1\u00b0",
                "\1\u00b1\37\uffff\1\u00b1",
                "\1\u00b2\37\uffff\1\u00b2",
                "\1\u00b3\37\uffff\1\u00b3",
                "\1\u00b4\37\uffff\1\u00b4",
                "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
                "\1\u00b6\37\uffff\1\u00b6",
                "\1\u00b7\37\uffff\1\u00b7",
                "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
                "",
                "",
                "",
                "",
                "\1\u00b9\37\uffff\1\u00b9",
                "\1\u00ba\37\uffff\1\u00ba",
                "\1\u00bb\37\uffff\1\u00bb",
                "\1\u00bc\37\uffff\1\u00bc",
                "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
                "\1\u00be\37\uffff\1\u00be",
                "\1\u00bf\37\uffff\1\u00bf",
                "\1\u00c0\37\uffff\1\u00c0",
                "\1\u00c1\37\uffff\1\u00c1",
                "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
                "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
                "",
                "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
                "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
                "",
                "\1\u00c6\37\uffff\1\u00c6",
                "\1\u00c7\37\uffff\1\u00c7",
                "\1\u00c8\37\uffff\1\u00c8",
                "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
                "",
                "\1\u00ca\37\uffff\1\u00ca",
                "\1\u00cb\37\uffff\1\u00cb",
                "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
                "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
                "",
                "",
                "",
                "",
                "\1\u00ce\37\uffff\1\u00ce",
                "\1\u00cf\37\uffff\1\u00cf",
                "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
                "",
                "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
                "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
                "",
                "",
                "\1\u00d3\37\uffff\1\u00d3",
                "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
                "",
                "",
                "",
                "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
                "",
                ""
        };
    }

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Hyperperiod | Classifier | Contracts | Guarantee | Reference | Constant | Periodic | TracesTo | Andthen | Applies | Binding | Compute | Implies | Fun | Assume | Orelse | Delta | False | Flows | Modes | True | With | PlusSignEqualsSignGreaterThanSign | And | For | Not | FullStopFullStop | ColonColon | LessThanSignEqualsSign | LessThanSignGreaterThanSign | EqualsSignGreaterThanSign | GreaterThanSignEqualsSign | In | Or | To | PercentSign | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | Semicolon | LessThanSign | EqualsSign | GreaterThanSign | LeftSquareBracket | RightSquareBracket | CircumflexAccent | LeftCurlyBracket | RightCurlyBracket | RULE_SL_COMMENT | RULE_REAL_LIT | RULE_INTEGER_LIT | RULE_STRING | RULE_ID | RULE_WS );";
        }
    }
 

}