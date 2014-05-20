package org.eclipselabs.spray.shapes.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalShapeLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__159=159;
    public static final int T__27=27;
    public static final int T__158=158;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__160=160;
    public static final int T__167=167;
    public static final int T__168=168;
    public static final int EOF=-1;
    public static final int T__165=165;
    public static final int T__166=166;
    public static final int T__163=163;
    public static final int T__164=164;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__19=19;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int RULE_HEX=7;
    public static final int T__16=16;
    public static final int T__148=148;
    public static final int T__90=90;
    public static final int T__15=15;
    public static final int T__147=147;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__149=149;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_DECIMAL=8;
    public static final int T__154=154;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int T__157=157;
    public static final int T__99=99;
    public static final int T__150=150;
    public static final int T__98=98;
    public static final int T__151=151;
    public static final int T__97=97;
    public static final int T__152=152;
    public static final int T__96=96;
    public static final int T__153=153;
    public static final int T__95=95;
    public static final int T__139=139;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__141=141;
    public static final int T__85=85;
    public static final int T__142=142;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__140=140;
    public static final int T__86=86;
    public static final int T__145=145;
    public static final int T__89=89;
    public static final int T__146=146;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int RULE_STRING=6;
    public static final int T__127=127;
    public static final int T__71=71;
    public static final int T__129=129;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__130=130;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__131=131;
    public static final int T__132=132;
    public static final int T__79=79;
    public static final int T__133=133;
    public static final int T__78=78;
    public static final int T__134=134;
    public static final int T__77=77;
    public static final int T__135=135;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__59=59;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int RULE_INT=5;
    public static final int T__112=112;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__183=183;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__180=180;
    public static final int T__182=182;
    public static final int T__181=181;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__175=175;
    public static final int T__30=30;
    public static final int T__174=174;
    public static final int T__31=31;
    public static final int T__173=173;
    public static final int T__32=32;
    public static final int T__172=172;
    public static final int T__33=33;
    public static final int T__179=179;
    public static final int T__34=34;
    public static final int T__178=178;
    public static final int T__35=35;
    public static final int T__177=177;
    public static final int T__36=36;
    public static final int T__176=176;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int RULE_WS=11;
    public static final int T__169=169;

    // delegates
    // delegators

    public InternalShapeLexer() {;} 
    public InternalShapeLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalShapeLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11:7: ( 'import' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:12:7: ( '.' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:12:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:13:7: ( '*' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:13:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:14:7: ( 'connection' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:14:9: 'connection'
            {
            match("connection"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:15:7: ( '{' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:15:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:16:7: ( 'connection-type' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:16:9: 'connection-type'
            {
            match("connection-type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:17:7: ( '}' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:17:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:18:7: ( 'shape' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:18:9: 'shape'
            {
            match("shape"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:19:7: ( 'placing' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:19:9: 'placing'
            {
            match("placing"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:20:7: ( 'position' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:20:9: 'position'
            {
            match("position"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:21:7: ( '(' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:21:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:22:7: ( 'offset' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:22:9: 'offset'
            {
            match("offset"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:23:7: ( '=' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:23:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:24:7: ( ',' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:24:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:25:7: ( 'radius' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:25:9: 'radius'
            {
            match("radius"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:26:7: ( 'angle' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:26:9: 'angle'
            {
            match("angle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:27:7: ( ')' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:27:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:28:7: ( 'anchor' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:28:9: 'anchor'
            {
            match("anchor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:29:7: ( 'xoffset' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:29:9: 'xoffset'
            {
            match("xoffset"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:30:7: ( 'yoffset' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:30:9: 'yoffset'
            {
            match("yoffset"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:31:7: ( 'x' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:31:9: 'x'
            {
            match('x'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:32:7: ( 'y' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:32:9: 'y'
            {
            match('y'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:33:7: ( 'line' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:33:9: 'line'
            {
            match("line"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:34:7: ( 'polyline' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:34:9: 'polyline'
            {
            match("polyline"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:35:7: ( 'rectangle' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:35:9: 'rectangle'
            {
            match("rectangle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:36:7: ( 'rounded-rectangle' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:36:9: 'rounded-rectangle'
            {
            match("rounded-rectangle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:37:7: ( 'polygon' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:37:9: 'polygon'
            {
            match("polygon"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:38:7: ( 'ellipse' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:38:9: 'ellipse'
            {
            match("ellipse"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:39:7: ( 'compartment' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:39:9: 'compartment'
            {
            match("compartment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:40:7: ( 'layout' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:40:9: 'layout'
            {
            match("layout"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:41:7: ( 'stretching' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:41:9: 'stretching'
            {
            match("stretching"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:42:7: ( 'horizontal' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:42:9: 'horizontal'
            {
            match("horizontal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:43:7: ( 'vertical' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:43:9: 'vertical'
            {
            match("vertical"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:44:7: ( 'spacing' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:44:9: 'spacing'
            {
            match("spacing"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:45:7: ( 'margin' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:45:9: 'margin'
            {
            match("margin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:46:7: ( 'invisible' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:46:9: 'invisible'
            {
            match("invisible"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:47:7: ( 'description' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:47:9: 'description'
            {
            match("description"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:48:7: ( 'align' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:48:9: 'align'
            {
            match("align"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:49:7: ( 'size-min' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:49:9: 'size-min'
            {
            match("size-min"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:50:7: ( 'width' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:50:9: 'width'
            {
            match("width"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:51:7: ( 'height' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:51:9: 'height'
            {
            match("height"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:52:7: ( 'size-max' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:52:9: 'size-max'
            {
            match("size-max"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:53:7: ( 'proportional' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:53:9: 'proportional'
            {
            match("proportional"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:54:7: ( 'curve' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:54:9: 'curve'
            {
            match("curve"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:55:7: ( 'style' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:55:9: 'style'
            {
            match("style"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:56:7: ( 'JAVA' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:56:9: 'JAVA'
            {
            match("JAVA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:57:7: ( 'size' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:57:9: 'size'
            {
            match("size"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:58:7: ( 'id' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:58:9: 'id'
            {
            match("id"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:59:7: ( 'point' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:59:9: 'point'
            {
            match("point"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:60:7: ( 'curveBefore' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:60:9: 'curveBefore'
            {
            match("curveBefore"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:61:7: ( 'curveAfter' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:61:9: 'curveAfter'
            {
            match("curveAfter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:62:7: ( 'true' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:62:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:63:7: ( 'false' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:63:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:64:7: ( '-' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:64:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:65:7: ( 'extends' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:65:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:66:7: ( 'gradient' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:66:9: 'gradient'
            {
            match("gradient"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:67:7: ( 'transparency' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:67:9: 'transparency'
            {
            match("transparency"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:68:7: ( 'background-color' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:68:9: 'background-color'
            {
            match("background-color"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:69:7: ( 'gradient-orientation' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:69:9: 'gradient-orientation'
            {
            match("gradient-orientation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:70:7: ( 'highlighting' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:70:9: 'highlighting'
            {
            match("highlighting"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:71:7: ( 'line-color' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:71:9: 'line-color'
            {
            match("line-color"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:72:7: ( 'line-width' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:72:9: 'line-width'
            {
            match("line-width"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:73:7: ( 'line-style' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:73:9: 'line-style'
            {
            match("line-style"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:74:7: ( 'font-name' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:74:9: 'font-name'
            {
            match("font-name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:75:7: ( 'font-color' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:75:9: 'font-color'
            {
            match("font-color"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:76:7: ( 'font-size' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:76:9: 'font-size'
            {
            match("font-size"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:77:7: ( 'font-italic' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:77:9: 'font-italic'
            {
            match("font-italic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:78:7: ( 'font-bold' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:78:9: 'font-bold'
            {
            match("font-bold"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:79:7: ( 'area' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:79:9: 'area'
            {
            match("area"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:80:7: ( 'selected' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:80:9: 'selected'
            {
            match("selected"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:81:7: ( 'multiselected' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:81:9: 'multiselected'
            {
            match("multiselected"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:82:7: ( 'allowed' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:82:9: 'allowed'
            {
            match("allowed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:83:7: ( 'unallowed' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:83:9: 'unallowed'
            {
            match("unallowed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:84:7: ( 'color' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:84:9: 'color'
            {
            match("color"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:85:7: ( 'RGB' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:85:9: 'RGB'
            {
            match("RGB"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:86:7: ( 'transparent' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:86:9: 'transparent'
            {
            match("transparent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:87:7: ( '+=' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:87:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:88:7: ( '-=' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:88:9: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:89:7: ( '||' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:89:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:90:7: ( '&&' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:90:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:91:7: ( '==' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:91:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:92:7: ( '!=' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:92:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:93:7: ( '===' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:93:9: '==='
            {
            match("==="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:94:7: ( '!==' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:94:9: '!=='
            {
            match("!=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:95:7: ( 'instanceof' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:95:9: 'instanceof'
            {
            match("instanceof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:96:7: ( '>=' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:96:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:97:7: ( '<=' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:97:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:98:8: ( '>' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:98:10: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:99:8: ( '<' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:99:10: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:100:8: ( '->' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:100:10: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:101:8: ( '..<' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:101:10: '..<'
            {
            match("..<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:102:8: ( '..' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:102:10: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:103:8: ( '=>' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:103:10: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:104:8: ( '<>' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:104:10: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:105:8: ( '?:' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:105:10: '?:'
            {
            match("?:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:106:8: ( '<=>' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:106:10: '<=>'
            {
            match("<=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:107:8: ( '+' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:107:10: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:108:8: ( '**' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:108:10: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:109:8: ( '/' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:109:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:110:8: ( '%' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:110:10: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:111:8: ( '!' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:111:10: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:112:8: ( 'as' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:112:10: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:113:8: ( '::' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:113:10: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:114:8: ( '?.' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:114:10: '?.'
            {
            match("?."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:115:8: ( '#' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:115:10: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:116:8: ( '[' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:116:10: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:117:8: ( ']' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:117:10: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:118:8: ( '|' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:118:10: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:119:8: ( ';' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:119:10: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:120:8: ( 'if' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:120:10: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:121:8: ( 'else' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:121:10: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:122:8: ( 'switch' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:122:10: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:123:8: ( ':' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:123:10: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:124:8: ( 'default' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:124:10: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:125:8: ( 'case' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:125:10: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:126:8: ( 'for' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:126:10: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:127:8: ( 'while' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:127:10: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:128:8: ( 'do' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:128:10: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "T__131"
    public final void mT__131() throws RecognitionException {
        try {
            int _type = T__131;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:129:8: ( 'var' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:129:10: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__131"

    // $ANTLR start "T__132"
    public final void mT__132() throws RecognitionException {
        try {
            int _type = T__132;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:130:8: ( 'val' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:130:10: 'val'
            {
            match("val"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__132"

    // $ANTLR start "T__133"
    public final void mT__133() throws RecognitionException {
        try {
            int _type = T__133;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:131:8: ( 'static' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:131:10: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__133"

    // $ANTLR start "T__134"
    public final void mT__134() throws RecognitionException {
        try {
            int _type = T__134;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:132:8: ( 'extension' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:132:10: 'extension'
            {
            match("extension"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__134"

    // $ANTLR start "T__135"
    public final void mT__135() throws RecognitionException {
        try {
            int _type = T__135;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:133:8: ( 'super' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:133:10: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__135"

    // $ANTLR start "T__136"
    public final void mT__136() throws RecognitionException {
        try {
            int _type = T__136;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:134:8: ( 'new' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:134:10: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__136"

    // $ANTLR start "T__137"
    public final void mT__137() throws RecognitionException {
        try {
            int _type = T__137;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:135:8: ( 'null' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:135:10: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__137"

    // $ANTLR start "T__138"
    public final void mT__138() throws RecognitionException {
        try {
            int _type = T__138;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:136:8: ( 'typeof' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:136:10: 'typeof'
            {
            match("typeof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__138"

    // $ANTLR start "T__139"
    public final void mT__139() throws RecognitionException {
        try {
            int _type = T__139;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:137:8: ( 'throw' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:137:10: 'throw'
            {
            match("throw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__139"

    // $ANTLR start "T__140"
    public final void mT__140() throws RecognitionException {
        try {
            int _type = T__140;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:138:8: ( 'return' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:138:10: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__140"

    // $ANTLR start "T__141"
    public final void mT__141() throws RecognitionException {
        try {
            int _type = T__141;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:139:8: ( 'try' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:139:10: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__141"

    // $ANTLR start "T__142"
    public final void mT__142() throws RecognitionException {
        try {
            int _type = T__142;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:140:8: ( 'finally' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:140:10: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__142"

    // $ANTLR start "T__143"
    public final void mT__143() throws RecognitionException {
        try {
            int _type = T__143;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:141:8: ( 'catch' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:141:10: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__143"

    // $ANTLR start "T__144"
    public final void mT__144() throws RecognitionException {
        try {
            int _type = T__144;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:142:8: ( '?' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:142:10: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__144"

    // $ANTLR start "T__145"
    public final void mT__145() throws RecognitionException {
        try {
            int _type = T__145;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:143:8: ( '&' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:143:10: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__145"

    // $ANTLR start "T__146"
    public final void mT__146() throws RecognitionException {
        try {
            int _type = T__146;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:144:8: ( 'fixed' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:144:10: 'fixed'
            {
            match("fixed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__146"

    // $ANTLR start "T__147"
    public final void mT__147() throws RecognitionException {
        try {
            int _type = T__147;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:145:8: ( 'fit' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:145:10: 'fit'
            {
            match("fit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__147"

    // $ANTLR start "T__148"
    public final void mT__148() throws RecognitionException {
        try {
            int _type = T__148;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:146:8: ( 'left' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:146:10: 'left'
            {
            match("left"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__148"

    // $ANTLR start "T__149"
    public final void mT__149() throws RecognitionException {
        try {
            int _type = T__149;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:147:8: ( 'center' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:147:10: 'center'
            {
            match("center"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__149"

    // $ANTLR start "T__150"
    public final void mT__150() throws RecognitionException {
        try {
            int _type = T__150;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:148:8: ( 'right' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:148:10: 'right'
            {
            match("right"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__150"

    // $ANTLR start "T__151"
    public final void mT__151() throws RecognitionException {
        try {
            int _type = T__151;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:149:8: ( 'top' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:149:10: 'top'
            {
            match("top"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__151"

    // $ANTLR start "T__152"
    public final void mT__152() throws RecognitionException {
        try {
            int _type = T__152;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:150:8: ( 'middle' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:150:10: 'middle'
            {
            match("middle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__152"

    // $ANTLR start "T__153"
    public final void mT__153() throws RecognitionException {
        try {
            int _type = T__153;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:151:8: ( 'bottom' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:151:10: 'bottom'
            {
            match("bottom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__153"

    // $ANTLR start "T__154"
    public final void mT__154() throws RecognitionException {
        try {
            int _type = T__154;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:152:8: ( 'freeform' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:152:10: 'freeform'
            {
            match("freeform"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__154"

    // $ANTLR start "T__155"
    public final void mT__155() throws RecognitionException {
        try {
            int _type = T__155;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:153:8: ( 'manhatten' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:153:10: 'manhatten'
            {
            match("manhatten"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__155"

    // $ANTLR start "T__156"
    public final void mT__156() throws RecognitionException {
        try {
            int _type = T__156;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:154:8: ( 'corners' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:154:10: 'corners'
            {
            match("corners"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__156"

    // $ANTLR start "T__157"
    public final void mT__157() throws RecognitionException {
        try {
            int _type = T__157;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:155:8: ( 'text' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:155:10: 'text'
            {
            match("text"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__157"

    // $ANTLR start "T__158"
    public final void mT__158() throws RecognitionException {
        try {
            int _type = T__158;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:156:8: ( 'wrapped-text' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:156:10: 'wrapped-text'
            {
            match("wrapped-text"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__158"

    // $ANTLR start "T__159"
    public final void mT__159() throws RecognitionException {
        try {
            int _type = T__159;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:157:8: ( 'white' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:157:10: 'white'
            {
            match("white"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__159"

    // $ANTLR start "T__160"
    public final void mT__160() throws RecognitionException {
        try {
            int _type = T__160;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:158:8: ( 'very-light-gray' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:158:10: 'very-light-gray'
            {
            match("very-light-gray"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__160"

    // $ANTLR start "T__161"
    public final void mT__161() throws RecognitionException {
        try {
            int _type = T__161;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:159:8: ( 'light-gray' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:159:10: 'light-gray'
            {
            match("light-gray"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__161"

    // $ANTLR start "T__162"
    public final void mT__162() throws RecognitionException {
        try {
            int _type = T__162;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:160:8: ( 'gray' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:160:10: 'gray'
            {
            match("gray"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__162"

    // $ANTLR start "T__163"
    public final void mT__163() throws RecognitionException {
        try {
            int _type = T__163;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:161:8: ( 'dark-gray' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:161:10: 'dark-gray'
            {
            match("dark-gray"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__163"

    // $ANTLR start "T__164"
    public final void mT__164() throws RecognitionException {
        try {
            int _type = T__164;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:162:8: ( 'black' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:162:10: 'black'
            {
            match("black"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__164"

    // $ANTLR start "T__165"
    public final void mT__165() throws RecognitionException {
        try {
            int _type = T__165;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:163:8: ( 'red' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:163:10: 'red'
            {
            match("red"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__165"

    // $ANTLR start "T__166"
    public final void mT__166() throws RecognitionException {
        try {
            int _type = T__166;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:164:8: ( 'light-orange' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:164:10: 'light-orange'
            {
            match("light-orange"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__166"

    // $ANTLR start "T__167"
    public final void mT__167() throws RecognitionException {
        try {
            int _type = T__167;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:165:8: ( 'orange' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:165:10: 'orange'
            {
            match("orange"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__167"

    // $ANTLR start "T__168"
    public final void mT__168() throws RecognitionException {
        try {
            int _type = T__168;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:166:8: ( 'dark-orange' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:166:10: 'dark-orange'
            {
            match("dark-orange"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__168"

    // $ANTLR start "T__169"
    public final void mT__169() throws RecognitionException {
        try {
            int _type = T__169;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:167:8: ( 'yellow' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:167:10: 'yellow'
            {
            match("yellow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__169"

    // $ANTLR start "T__170"
    public final void mT__170() throws RecognitionException {
        try {
            int _type = T__170;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:168:8: ( 'green' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:168:10: 'green'
            {
            match("green"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__170"

    // $ANTLR start "T__171"
    public final void mT__171() throws RecognitionException {
        try {
            int _type = T__171;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:169:8: ( 'light-green' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:169:10: 'light-green'
            {
            match("light-green"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__171"

    // $ANTLR start "T__172"
    public final void mT__172() throws RecognitionException {
        try {
            int _type = T__172;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:170:8: ( 'dark-green' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:170:10: 'dark-green'
            {
            match("dark-green"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__172"

    // $ANTLR start "T__173"
    public final void mT__173() throws RecognitionException {
        try {
            int _type = T__173;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:171:8: ( 'cyan' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:171:10: 'cyan'
            {
            match("cyan"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__173"

    // $ANTLR start "T__174"
    public final void mT__174() throws RecognitionException {
        try {
            int _type = T__174;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:172:8: ( 'light-blue' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:172:10: 'light-blue'
            {
            match("light-blue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__174"

    // $ANTLR start "T__175"
    public final void mT__175() throws RecognitionException {
        try {
            int _type = T__175;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:173:8: ( 'blue' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:173:10: 'blue'
            {
            match("blue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__175"

    // $ANTLR start "T__176"
    public final void mT__176() throws RecognitionException {
        try {
            int _type = T__176;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:174:8: ( 'dark-blue' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:174:10: 'dark-blue'
            {
            match("dark-blue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__176"

    // $ANTLR start "T__177"
    public final void mT__177() throws RecognitionException {
        try {
            int _type = T__177;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:175:8: ( 'solid' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:175:10: 'solid'
            {
            match("solid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__177"

    // $ANTLR start "T__178"
    public final void mT__178() throws RecognitionException {
        try {
            int _type = T__178;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:176:8: ( 'dot' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:176:10: 'dot'
            {
            match("dot"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__178"

    // $ANTLR start "T__179"
    public final void mT__179() throws RecognitionException {
        try {
            int _type = T__179;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:177:8: ( 'dash' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:177:10: 'dash'
            {
            match("dash"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__179"

    // $ANTLR start "T__180"
    public final void mT__180() throws RecognitionException {
        try {
            int _type = T__180;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:178:8: ( 'dash-dot' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:178:10: 'dash-dot'
            {
            match("dash-dot"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__180"

    // $ANTLR start "T__181"
    public final void mT__181() throws RecognitionException {
        try {
            int _type = T__181;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:179:8: ( 'dash-dot-dot' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:179:10: 'dash-dot-dot'
            {
            match("dash-dot-dot"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__181"

    // $ANTLR start "T__182"
    public final void mT__182() throws RecognitionException {
        try {
            int _type = T__182;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:180:8: ( 'yes' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:180:10: 'yes'
            {
            match("yes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__182"

    // $ANTLR start "T__183"
    public final void mT__183() throws RecognitionException {
        try {
            int _type = T__183;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:181:8: ( 'no' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:181:10: 'no'
            {
            match("no"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__183"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11708:10: ( ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )? )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11708:12: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            {
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11708:12: ( '0x' | '0X' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='0') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='x') ) {
                    alt1=1;
                }
                else if ( (LA1_1=='X') ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11708:13: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11708:18: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11708:24: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='F')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='f')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11708:58: ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='#') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11708:59: '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    {
                    match('#'); 
                    // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11708:63: ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='B'||LA3_0=='b') ) {
                        alt3=1;
                    }
                    else if ( (LA3_0=='L'||LA3_0=='l') ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11708:64: ( 'b' | 'B' ) ( 'i' | 'I' )
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


                            }
                            break;
                        case 2 :
                            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11708:84: ( 'l' | 'L' )
                            {
                            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


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
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11710:10: ( '0' .. '9' ( '0' .. '9' | '_' )* )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11710:12: '0' .. '9' ( '0' .. '9' | '_' )*
            {
            matchRange('0','9'); 
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11710:21: ( '0' .. '9' | '_' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||LA5_0=='_') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11712:14: ( RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )? )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11712:16: RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            {
            mRULE_INT(); 
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11712:25: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='E'||LA7_0=='e') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11712:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11712:36: ( '+' | '-' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='+'||LA6_0=='-') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:
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

                    mRULE_INT(); 

                    }
                    break;

            }

            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11712:58: ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='B'||LA8_0=='b') ) {
                alt8=1;
            }
            else if ( (LA8_0=='D'||LA8_0=='F'||LA8_0=='L'||LA8_0=='d'||LA8_0=='f'||LA8_0=='l') ) {
                alt8=2;
            }
            switch (alt8) {
                case 1 :
                    // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11712:59: ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' )
                    {
                    if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='I'||input.LA(1)=='d'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11712:87: ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' )
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='L'||input.LA(1)=='d'||input.LA(1)=='f'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


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
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11714:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )* )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11714:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            {
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11714:11: ( '^' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='^') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11714:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11714:44: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='$'||(LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
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

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11716:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11716:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11716:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\"') ) {
                alt13=1;
            }
            else if ( (LA13_0=='\'') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11716:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11716:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11716:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11716:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop11;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11716:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11716:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11716:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11716:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop12;
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

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11718:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11718:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11718:24: ( options {greedy=false; } : . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='*') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='/') ) {
                        alt14=2;
                    }
                    else if ( ((LA14_1>='\u0000' && LA14_1<='.')||(LA14_1>='0' && LA14_1<='\uFFFF')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<=')')||(LA14_0>='+' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11718:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11720:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11720:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11720:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11720:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop15;
                }
            } while (true);

            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11720:40: ( ( '\\r' )? '\\n' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\n'||LA17_0=='\r') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11720:41: ( '\\r' )? '\\n'
                    {
                    // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11720:41: ( '\\r' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='\r') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11720:41: '\\r'
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11722:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11722:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11722:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:
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
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11724:16: ( . )
            // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:11724:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | T__183 | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt19=180;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:214: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:220: T__48
                {
                mT__48(); 

                }
                break;
            case 37 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:226: T__49
                {
                mT__49(); 

                }
                break;
            case 38 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:232: T__50
                {
                mT__50(); 

                }
                break;
            case 39 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:238: T__51
                {
                mT__51(); 

                }
                break;
            case 40 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:244: T__52
                {
                mT__52(); 

                }
                break;
            case 41 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:250: T__53
                {
                mT__53(); 

                }
                break;
            case 42 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:256: T__54
                {
                mT__54(); 

                }
                break;
            case 43 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:262: T__55
                {
                mT__55(); 

                }
                break;
            case 44 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:268: T__56
                {
                mT__56(); 

                }
                break;
            case 45 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:274: T__57
                {
                mT__57(); 

                }
                break;
            case 46 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:280: T__58
                {
                mT__58(); 

                }
                break;
            case 47 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:286: T__59
                {
                mT__59(); 

                }
                break;
            case 48 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:292: T__60
                {
                mT__60(); 

                }
                break;
            case 49 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:298: T__61
                {
                mT__61(); 

                }
                break;
            case 50 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:304: T__62
                {
                mT__62(); 

                }
                break;
            case 51 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:310: T__63
                {
                mT__63(); 

                }
                break;
            case 52 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:316: T__64
                {
                mT__64(); 

                }
                break;
            case 53 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:322: T__65
                {
                mT__65(); 

                }
                break;
            case 54 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:328: T__66
                {
                mT__66(); 

                }
                break;
            case 55 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:334: T__67
                {
                mT__67(); 

                }
                break;
            case 56 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:340: T__68
                {
                mT__68(); 

                }
                break;
            case 57 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:346: T__69
                {
                mT__69(); 

                }
                break;
            case 58 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:352: T__70
                {
                mT__70(); 

                }
                break;
            case 59 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:358: T__71
                {
                mT__71(); 

                }
                break;
            case 60 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:364: T__72
                {
                mT__72(); 

                }
                break;
            case 61 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:370: T__73
                {
                mT__73(); 

                }
                break;
            case 62 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:376: T__74
                {
                mT__74(); 

                }
                break;
            case 63 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:382: T__75
                {
                mT__75(); 

                }
                break;
            case 64 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:388: T__76
                {
                mT__76(); 

                }
                break;
            case 65 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:394: T__77
                {
                mT__77(); 

                }
                break;
            case 66 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:400: T__78
                {
                mT__78(); 

                }
                break;
            case 67 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:406: T__79
                {
                mT__79(); 

                }
                break;
            case 68 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:412: T__80
                {
                mT__80(); 

                }
                break;
            case 69 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:418: T__81
                {
                mT__81(); 

                }
                break;
            case 70 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:424: T__82
                {
                mT__82(); 

                }
                break;
            case 71 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:430: T__83
                {
                mT__83(); 

                }
                break;
            case 72 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:436: T__84
                {
                mT__84(); 

                }
                break;
            case 73 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:442: T__85
                {
                mT__85(); 

                }
                break;
            case 74 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:448: T__86
                {
                mT__86(); 

                }
                break;
            case 75 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:454: T__87
                {
                mT__87(); 

                }
                break;
            case 76 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:460: T__88
                {
                mT__88(); 

                }
                break;
            case 77 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:466: T__89
                {
                mT__89(); 

                }
                break;
            case 78 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:472: T__90
                {
                mT__90(); 

                }
                break;
            case 79 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:478: T__91
                {
                mT__91(); 

                }
                break;
            case 80 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:484: T__92
                {
                mT__92(); 

                }
                break;
            case 81 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:490: T__93
                {
                mT__93(); 

                }
                break;
            case 82 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:496: T__94
                {
                mT__94(); 

                }
                break;
            case 83 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:502: T__95
                {
                mT__95(); 

                }
                break;
            case 84 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:508: T__96
                {
                mT__96(); 

                }
                break;
            case 85 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:514: T__97
                {
                mT__97(); 

                }
                break;
            case 86 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:520: T__98
                {
                mT__98(); 

                }
                break;
            case 87 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:526: T__99
                {
                mT__99(); 

                }
                break;
            case 88 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:532: T__100
                {
                mT__100(); 

                }
                break;
            case 89 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:539: T__101
                {
                mT__101(); 

                }
                break;
            case 90 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:546: T__102
                {
                mT__102(); 

                }
                break;
            case 91 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:553: T__103
                {
                mT__103(); 

                }
                break;
            case 92 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:560: T__104
                {
                mT__104(); 

                }
                break;
            case 93 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:567: T__105
                {
                mT__105(); 

                }
                break;
            case 94 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:574: T__106
                {
                mT__106(); 

                }
                break;
            case 95 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:581: T__107
                {
                mT__107(); 

                }
                break;
            case 96 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:588: T__108
                {
                mT__108(); 

                }
                break;
            case 97 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:595: T__109
                {
                mT__109(); 

                }
                break;
            case 98 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:602: T__110
                {
                mT__110(); 

                }
                break;
            case 99 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:609: T__111
                {
                mT__111(); 

                }
                break;
            case 100 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:616: T__112
                {
                mT__112(); 

                }
                break;
            case 101 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:623: T__113
                {
                mT__113(); 

                }
                break;
            case 102 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:630: T__114
                {
                mT__114(); 

                }
                break;
            case 103 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:637: T__115
                {
                mT__115(); 

                }
                break;
            case 104 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:644: T__116
                {
                mT__116(); 

                }
                break;
            case 105 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:651: T__117
                {
                mT__117(); 

                }
                break;
            case 106 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:658: T__118
                {
                mT__118(); 

                }
                break;
            case 107 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:665: T__119
                {
                mT__119(); 

                }
                break;
            case 108 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:672: T__120
                {
                mT__120(); 

                }
                break;
            case 109 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:679: T__121
                {
                mT__121(); 

                }
                break;
            case 110 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:686: T__122
                {
                mT__122(); 

                }
                break;
            case 111 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:693: T__123
                {
                mT__123(); 

                }
                break;
            case 112 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:700: T__124
                {
                mT__124(); 

                }
                break;
            case 113 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:707: T__125
                {
                mT__125(); 

                }
                break;
            case 114 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:714: T__126
                {
                mT__126(); 

                }
                break;
            case 115 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:721: T__127
                {
                mT__127(); 

                }
                break;
            case 116 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:728: T__128
                {
                mT__128(); 

                }
                break;
            case 117 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:735: T__129
                {
                mT__129(); 

                }
                break;
            case 118 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:742: T__130
                {
                mT__130(); 

                }
                break;
            case 119 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:749: T__131
                {
                mT__131(); 

                }
                break;
            case 120 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:756: T__132
                {
                mT__132(); 

                }
                break;
            case 121 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:763: T__133
                {
                mT__133(); 

                }
                break;
            case 122 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:770: T__134
                {
                mT__134(); 

                }
                break;
            case 123 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:777: T__135
                {
                mT__135(); 

                }
                break;
            case 124 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:784: T__136
                {
                mT__136(); 

                }
                break;
            case 125 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:791: T__137
                {
                mT__137(); 

                }
                break;
            case 126 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:798: T__138
                {
                mT__138(); 

                }
                break;
            case 127 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:805: T__139
                {
                mT__139(); 

                }
                break;
            case 128 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:812: T__140
                {
                mT__140(); 

                }
                break;
            case 129 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:819: T__141
                {
                mT__141(); 

                }
                break;
            case 130 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:826: T__142
                {
                mT__142(); 

                }
                break;
            case 131 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:833: T__143
                {
                mT__143(); 

                }
                break;
            case 132 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:840: T__144
                {
                mT__144(); 

                }
                break;
            case 133 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:847: T__145
                {
                mT__145(); 

                }
                break;
            case 134 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:854: T__146
                {
                mT__146(); 

                }
                break;
            case 135 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:861: T__147
                {
                mT__147(); 

                }
                break;
            case 136 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:868: T__148
                {
                mT__148(); 

                }
                break;
            case 137 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:875: T__149
                {
                mT__149(); 

                }
                break;
            case 138 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:882: T__150
                {
                mT__150(); 

                }
                break;
            case 139 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:889: T__151
                {
                mT__151(); 

                }
                break;
            case 140 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:896: T__152
                {
                mT__152(); 

                }
                break;
            case 141 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:903: T__153
                {
                mT__153(); 

                }
                break;
            case 142 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:910: T__154
                {
                mT__154(); 

                }
                break;
            case 143 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:917: T__155
                {
                mT__155(); 

                }
                break;
            case 144 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:924: T__156
                {
                mT__156(); 

                }
                break;
            case 145 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:931: T__157
                {
                mT__157(); 

                }
                break;
            case 146 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:938: T__158
                {
                mT__158(); 

                }
                break;
            case 147 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:945: T__159
                {
                mT__159(); 

                }
                break;
            case 148 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:952: T__160
                {
                mT__160(); 

                }
                break;
            case 149 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:959: T__161
                {
                mT__161(); 

                }
                break;
            case 150 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:966: T__162
                {
                mT__162(); 

                }
                break;
            case 151 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:973: T__163
                {
                mT__163(); 

                }
                break;
            case 152 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:980: T__164
                {
                mT__164(); 

                }
                break;
            case 153 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:987: T__165
                {
                mT__165(); 

                }
                break;
            case 154 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:994: T__166
                {
                mT__166(); 

                }
                break;
            case 155 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:1001: T__167
                {
                mT__167(); 

                }
                break;
            case 156 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:1008: T__168
                {
                mT__168(); 

                }
                break;
            case 157 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:1015: T__169
                {
                mT__169(); 

                }
                break;
            case 158 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:1022: T__170
                {
                mT__170(); 

                }
                break;
            case 159 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:1029: T__171
                {
                mT__171(); 

                }
                break;
            case 160 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:1036: T__172
                {
                mT__172(); 

                }
                break;
            case 161 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:1043: T__173
                {
                mT__173(); 

                }
                break;
            case 162 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:1050: T__174
                {
                mT__174(); 

                }
                break;
            case 163 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:1057: T__175
                {
                mT__175(); 

                }
                break;
            case 164 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:1064: T__176
                {
                mT__176(); 

                }
                break;
            case 165 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:1071: T__177
                {
                mT__177(); 

                }
                break;
            case 166 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:1078: T__178
                {
                mT__178(); 

                }
                break;
            case 167 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:1085: T__179
                {
                mT__179(); 

                }
                break;
            case 168 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:1092: T__180
                {
                mT__180(); 

                }
                break;
            case 169 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:1099: T__181
                {
                mT__181(); 

                }
                break;
            case 170 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:1106: T__182
                {
                mT__182(); 

                }
                break;
            case 171 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:1113: T__183
                {
                mT__183(); 

                }
                break;
            case 172 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:1120: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 173 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:1129: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 174 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:1138: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 175 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:1151: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 176 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:1159: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 177 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:1171: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 178 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:1187: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 179 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:1203: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 180 :
                // ../../plugins/org.eclipselabs.spray.shapes/src-gen/org/eclipselabs/spray/shapes/parser/antlr/internal/InternalShape.g:1:1211: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA19_eotS =
        "\1\uffff\1\74\1\76\1\100\1\74\2\uffff\2\74\1\uffff\1\74\1\130\1"+
        "\uffff\2\74\1\uffff\1\144\1\147\12\74\1\u0087\4\74\1\u008f\1\u0091"+
        "\1\u0093\1\u0095\1\u0097\1\u009a\1\u009d\1\u00a0\1\uffff\1\u00a3"+
        "\4\uffff\1\74\2\u00ad\1\67\1\uffff\2\67\2\uffff\2\74\1\u00b4\1\u00b5"+
        "\1\uffff\1\u00b7\3\uffff\5\74\2\uffff\13\74\1\uffff\2\74\1\u00d3"+
        "\3\uffff\7\74\1\u00df\1\uffff\1\74\1\uffff\2\74\1\uffff\16\74\1"+
        "\u00f8\16\74\3\uffff\6\74\6\uffff\1\u0116\3\uffff\1\u0118\17\uffff"+
        "\2\74\1\u011b\1\uffff\1\u00ad\4\uffff\3\74\4\uffff\32\74\2\uffff"+
        "\3\74\1\u013c\7\74\1\uffff\3\74\1\u0147\13\74\1\u0154\1\u0155\6"+
        "\74\1\u015c\1\uffff\10\74\1\u0166\2\74\1\u0169\3\74\1\u016d\2\74"+
        "\1\u0170\10\74\1\u017a\4\uffff\1\u017b\1\74\1\uffff\10\74\1\u0185"+
        "\2\74\1\u0188\5\74\1\u018f\16\74\1\uffff\6\74\1\u01a5\3\74\1\uffff"+
        "\1\u01aa\2\74\1\u01ad\1\74\1\u01af\6\74\2\uffff\6\74\1\uffff\1\74"+
        "\1\u01be\4\74\1\u01c3\1\u01c4\1\74\1\uffff\2\74\1\uffff\1\u01c8"+
        "\2\74\1\uffff\2\74\1\uffff\2\74\1\u01cf\4\74\1\u01d4\1\74\2\uffff"+
        "\1\u01d6\5\74\1\u01dc\1\74\1\u01e0\1\uffff\1\u01e1\1\74\1\uffff"+
        "\1\u01e3\1\74\1\u01e5\2\74\2\uffff\2\74\1\u01eb\1\u01ec\4\74\1\u01f1"+
        "\7\74\1\u01f9\1\u01fa\1\74\1\u01fc\1\74\1\uffff\3\74\2\uffff\2\74"+
        "\1\uffff\1\74\1\uffff\5\74\1\uffff\6\74\3\uffff\1\u0217\1\u0218"+
        "\1\u0219\1\74\2\uffff\2\74\1\u021d\1\uffff\1\u021e\1\uffff\1\74"+
        "\1\u0225\2\74\1\uffff\1\u0228\2\74\1\u022b\1\uffff\1\74\1\uffff"+
        "\1\u022d\4\74\1\uffff\3\74\2\uffff\1\u0235\1\uffff\1\74\1\uffff"+
        "\1\u0237\1\74\1\uffff\1\74\1\u023c\2\uffff\4\74\1\uffff\1\74\1\u0242"+
        "\1\u0243\1\u0244\1\74\1\u0246\1\74\2\uffff\1\u0248\1\uffff\3\74"+
        "\1\u024c\4\uffff\1\u0250\4\74\1\u0255\2\74\1\u0258\2\74\1\u025b"+
        "\2\74\7\uffff\2\74\1\u0262\7\uffff\1\74\1\uffff\2\74\1\uffff\1\74"+
        "\1\u0267\1\uffff\1\74\1\uffff\4\74\1\u026d\2\74\1\uffff\1\74\1\uffff"+
        "\1\u0271\2\uffff\1\74\1\uffff\1\u0273\2\74\1\u0276\1\74\3\uffff"+
        "\1\74\1\uffff\1\74\1\uffff\1\u027a\1\u027b\1\u027c\5\uffff\1\u027e"+
        "\1\u027f\2\74\1\uffff\2\74\1\uffff\2\74\1\uffff\1\74\1\u0287\2\uffff"+
        "\2\74\1\uffff\1\u028d\3\74\1\uffff\5\74\1\uffff\3\74\1\uffff\1\u0299"+
        "\1\uffff\1\u029a\1\u029b\1\uffff\2\74\7\uffff\3\74\1\u02a3\3\74"+
        "\3\uffff\1\u02a8\1\uffff\1\74\1\uffff\1\u02aa\1\u02ac\2\74\1\u02af"+
        "\6\74\3\uffff\1\74\1\u02b7\2\uffff\1\u02b8\2\74\1\uffff\1\u02bb"+
        "\2\74\2\uffff\1\74\3\uffff\1\74\1\u02c0\1\uffff\1\u02c1\1\u02c3"+
        "\2\74\1\u02c6\1\u02c7\1\74\2\uffff\1\u02c9\1\74\1\uffff\4\74\4\uffff"+
        "\1\u02d0\1\u02d1\2\uffff\1\74\1\uffff\2\74\1\u02d5\1\74\1\u02d7"+
        "\3\uffff\1\u02d8\1\u02d9\1\74\1\uffff\1\u02db\3\uffff\1\u02dc\2"+
        "\uffff";
    static final String DFA19_eofS =
        "\u02dd\uffff";
    static final String DFA19_minS =
        "\1\0\1\144\1\56\1\52\1\141\2\uffff\1\145\1\154\1\uffff\1\146\1\75"+
        "\1\uffff\1\141\1\154\1\uffff\2\44\1\141\1\154\1\145\3\141\1\150"+
        "\1\101\1\145\1\141\1\75\1\162\1\141\1\156\1\107\1\75\1\174\1\46"+
        "\3\75\1\56\1\52\1\uffff\1\72\4\uffff\1\145\2\60\1\44\1\uffff\2\0"+
        "\2\uffff\1\160\1\163\2\44\1\uffff\1\74\3\uffff\1\154\1\162\1\163"+
        "\1\156\1\141\2\uffff\3\141\1\172\1\154\1\151\1\160\1\154\1\141\1"+
        "\151\1\157\1\uffff\1\146\1\141\1\75\3\uffff\1\144\1\143\1\165\1"+
        "\147\1\143\1\151\1\145\1\44\1\uffff\1\146\1\uffff\1\146\1\154\1"+
        "\uffff\1\147\1\171\1\146\1\154\1\164\1\162\1\151\1\147\1\162\1\154"+
        "\1\156\1\154\1\144\1\146\1\44\1\162\1\144\1\151\1\141\1\126\1\141"+
        "\1\160\1\162\1\160\1\170\1\154\2\156\1\145\3\uffff\1\141\1\143\1"+
        "\164\2\141\1\102\6\uffff\1\75\3\uffff\1\76\17\uffff\1\167\1\154"+
        "\1\44\1\uffff\1\60\4\uffff\1\157\1\151\1\164\4\uffff\1\156\1\160"+
        "\1\157\1\156\1\166\1\145\1\143\1\164\1\156\1\160\1\145\1\154\1\164"+
        "\1\143\2\145\1\164\1\145\1\151\1\143\1\151\1\171\1\156\1\160\1\163"+
        "\1\156\2\uffff\1\151\1\164\1\165\1\44\1\156\1\150\1\154\1\150\1"+
        "\147\1\157\1\141\1\uffff\2\146\1\154\1\44\1\145\1\150\1\157\1\164"+
        "\1\151\2\145\1\151\1\147\1\150\1\164\2\44\1\147\1\150\1\164\1\144"+
        "\1\143\1\141\1\44\1\uffff\1\153\1\150\1\164\1\154\1\160\1\101\1"+
        "\145\1\156\1\44\1\145\1\157\1\44\1\164\1\163\1\164\1\44\1\141\1"+
        "\145\1\44\1\145\1\144\1\145\1\153\1\164\1\143\1\145\1\154\1\44\4"+
        "\uffff\1\44\1\154\1\uffff\1\162\1\163\1\141\1\145\1\141\1\162\2"+
        "\145\1\44\1\150\1\145\1\44\1\145\1\164\1\145\2\151\1\44\2\143\1"+
        "\162\1\144\1\151\1\164\1\147\1\164\1\157\1\145\1\147\1\165\1\141"+
        "\1\162\1\uffff\1\144\1\164\1\145\1\157\1\156\1\167\1\44\2\163\1"+
        "\157\1\uffff\1\44\1\164\1\165\1\44\1\160\1\44\1\156\1\172\1\150"+
        "\1\154\1\151\1\55\2\uffff\1\151\1\141\1\151\1\154\1\162\1\165\1"+
        "\uffff\1\55\1\44\1\150\2\145\1\160\2\44\1\163\1\uffff\1\157\1\167"+
        "\1\uffff\1\44\1\145\1\55\1\uffff\1\154\1\144\1\uffff\1\146\1\151"+
        "\1\44\1\156\1\147\1\157\1\153\1\44\1\154\2\uffff\1\44\1\164\1\151"+
        "\1\156\1\143\1\162\1\44\1\162\1\44\1\uffff\1\44\1\162\1\uffff\1"+
        "\44\1\143\1\44\1\143\1\156\1\155\1\uffff\1\164\1\150\2\44\1\156"+
        "\2\151\1\157\1\44\1\162\1\164\1\145\1\163\2\156\1\145\2\44\1\162"+
        "\1\44\1\145\1\uffff\2\145\1\167\1\143\1\uffff\1\55\1\164\1\uffff"+
        "\1\163\1\uffff\1\144\1\157\1\164\1\151\1\143\1\uffff\1\156\1\164"+
        "\1\163\1\145\1\151\1\154\1\142\1\144\1\uffff\3\44\1\145\2\uffff"+
        "\1\160\1\146\1\44\1\uffff\1\44\1\142\1\154\1\44\1\157\1\145\1\uffff"+
        "\1\44\1\162\1\155\1\44\1\uffff\1\157\1\uffff\1\44\1\142\1\143\2"+
        "\164\1\uffff\1\163\1\145\1\146\2\uffff\1\44\1\uffff\1\150\1\uffff"+
        "\1\44\1\147\1\141\1\145\1\44\2\uffff\1\147\1\157\2\156\1\uffff\1"+
        "\164\3\44\1\147\1\44\1\144\2\uffff\1\44\1\uffff\1\144\2\164\1\44"+
        "\3\uffff\1\142\1\44\1\145\1\163\1\151\1\156\1\44\1\147\1\141\1\44"+
        "\1\164\1\145\1\44\1\160\1\164\1\162\2\uffff\1\157\3\uffff\1\144"+
        "\1\141\1\44\7\uffff\1\171\1\uffff\1\162\1\156\1\uffff\1\157\1\44"+
        "\1\uffff\1\167\1\uffff\1\154\1\145\1\151\1\155\1\44\1\146\1\164"+
        "\1\uffff\1\151\1\uffff\1\44\2\uffff\1\144\1\uffff\1\44\1\156\1\145"+
        "\1\44\1\151\3\uffff\1\154\1\uffff\1\55\1\uffff\3\44\1\uffff\1\162"+
        "\3\uffff\2\44\1\157\1\164\1\uffff\1\150\1\154\1\uffff\1\145\1\154"+
        "\1\uffff\1\164\1\44\1\141\1\164\1\55\1\162\1\uffff\1\44\1\155\1"+
        "\164\1\165\1\uffff\2\145\2\157\1\145\1\uffff\1\157\1\145\1\156\1"+
        "\uffff\1\44\1\uffff\2\44\1\uffff\1\157\1\145\4\uffff\1\141\2\uffff"+
        "\1\156\1\141\1\164\1\44\1\156\1\145\1\151\3\uffff\1\55\1\uffff\1"+
        "\145\1\uffff\2\44\1\156\1\144\1\44\1\146\2\156\2\162\1\147\3\uffff"+
        "\1\156\1\44\2\uffff\1\44\1\154\1\151\1\uffff\1\44\1\143\1\157\2"+
        "\uffff\1\156\3\uffff\1\144\1\44\1\uffff\2\44\1\164\1\145\2\44\1"+
        "\141\2\uffff\1\44\1\156\1\uffff\1\164\1\156\1\143\1\55\4\uffff\2"+
        "\44\2\uffff\1\154\1\uffff\1\147\1\145\1\44\1\171\1\44\3\uffff\2"+
        "\44\1\144\1\uffff\1\44\3\uffff\1\44\2\uffff";
    static final String DFA19_maxS =
        "\1\uffff\1\156\1\56\1\52\1\171\2\uffff\1\167\1\162\1\uffff\1\162"+
        "\1\76\1\uffff\1\157\1\163\1\uffff\2\172\1\151\1\170\1\157\1\145"+
        "\1\165\1\157\1\162\1\101\1\171\1\162\1\76\1\162\1\157\1\156\1\107"+
        "\1\75\1\174\1\46\2\75\1\76\1\72\1\57\1\uffff\1\72\4\uffff\1\165"+
        "\1\170\1\154\1\172\1\uffff\2\uffff\2\uffff\1\160\1\166\2\172\1\uffff"+
        "\1\74\3\uffff\2\162\1\164\1\156\1\141\2\uffff\1\141\1\171\1\141"+
        "\1\172\1\154\1\151\1\160\1\154\1\141\1\163\1\157\1\uffff\1\146\1"+
        "\141\1\75\3\uffff\1\144\1\164\1\165\2\147\1\154\1\145\1\172\1\uffff"+
        "\1\146\1\uffff\1\146\1\163\1\uffff\1\156\1\171\1\146\1\163\1\164"+
        "\1\162\1\151\1\147\3\162\1\154\1\144\1\163\1\172\1\163\1\144\1\151"+
        "\1\141\1\126\1\171\1\160\1\162\1\160\1\170\1\154\1\162\1\170\1\145"+
        "\3\uffff\1\145\1\143\1\164\1\165\1\141\1\102\6\uffff\1\75\3\uffff"+
        "\1\76\17\uffff\1\167\1\154\1\172\1\uffff\1\154\4\uffff\1\157\1\151"+
        "\1\164\4\uffff\1\156\1\160\1\157\1\156\1\166\1\145\1\143\1\164\1"+
        "\156\1\160\1\145\1\154\1\164\1\143\2\145\1\164\1\145\1\151\1\143"+
        "\1\151\1\171\1\156\1\160\1\163\1\156\2\uffff\1\151\1\164\1\165\1"+
        "\172\1\156\1\150\1\154\1\150\1\147\1\157\1\141\1\uffff\2\146\1\154"+
        "\1\172\1\145\1\150\1\157\1\164\1\151\2\145\1\151\1\147\1\150\1\171"+
        "\2\172\1\147\1\150\1\164\1\144\1\143\1\141\1\172\1\uffff\1\153\1"+
        "\150\2\164\1\160\1\101\1\145\1\156\1\172\1\145\1\157\1\172\1\164"+
        "\1\163\1\164\1\172\1\141\1\145\1\172\1\145\1\171\1\145\1\153\1\164"+
        "\1\143\1\145\1\154\1\172\4\uffff\1\172\1\154\1\uffff\1\162\1\163"+
        "\1\141\1\145\1\141\1\162\2\145\1\172\1\150\1\145\1\172\1\145\1\164"+
        "\1\145\2\151\1\172\2\143\1\162\1\144\1\151\1\164\1\154\1\164\1\157"+
        "\1\145\1\147\1\165\1\141\1\162\1\uffff\1\144\1\164\1\145\1\157\1"+
        "\156\1\167\1\172\2\163\1\157\1\uffff\1\172\1\164\1\165\1\172\1\160"+
        "\1\172\1\156\1\172\1\150\1\154\1\151\1\55\2\uffff\1\151\1\141\1"+
        "\151\1\154\1\162\1\165\1\uffff\1\55\1\172\1\150\2\145\1\160\2\172"+
        "\1\163\1\uffff\1\157\1\167\1\uffff\1\172\1\145\1\55\1\uffff\1\154"+
        "\1\144\1\uffff\1\146\1\151\1\172\1\156\1\147\1\157\1\153\1\172\1"+
        "\154\2\uffff\1\172\1\164\1\151\1\156\1\143\1\162\1\172\1\162\1\172"+
        "\1\uffff\1\172\1\162\1\uffff\1\172\1\143\1\172\1\143\1\156\1\155"+
        "\1\uffff\1\164\1\150\2\172\1\156\2\151\1\157\1\172\1\162\1\164\1"+
        "\145\1\163\2\156\1\145\2\172\1\162\1\172\1\145\1\uffff\2\145\2\167"+
        "\1\uffff\1\55\1\164\1\uffff\1\163\1\uffff\1\163\1\157\1\164\1\151"+
        "\1\143\1\uffff\1\156\1\164\1\163\1\145\1\151\1\154\1\157\1\144\1"+
        "\uffff\3\172\1\145\2\uffff\1\160\1\146\1\172\1\uffff\1\172\1\163"+
        "\1\154\1\172\1\157\1\145\1\uffff\1\172\1\162\1\155\1\172\1\uffff"+
        "\1\157\1\uffff\1\172\1\142\1\143\2\164\1\uffff\1\163\1\145\1\146"+
        "\2\uffff\1\172\1\uffff\1\150\1\uffff\1\172\1\147\1\151\1\145\1\172"+
        "\2\uffff\1\147\1\157\2\156\1\uffff\1\164\3\172\1\147\1\172\1\144"+
        "\2\uffff\1\172\1\uffff\1\144\2\164\1\172\3\uffff\1\157\1\172\1\145"+
        "\1\163\1\151\1\156\1\172\1\147\1\141\1\172\1\164\1\145\1\172\1\160"+
        "\1\164\1\162\2\uffff\1\157\3\uffff\1\144\1\141\1\172\7\uffff\1\171"+
        "\1\uffff\1\162\1\156\1\uffff\1\157\1\172\1\uffff\1\167\1\uffff\1"+
        "\154\1\145\1\151\1\155\1\172\1\146\1\164\1\uffff\1\151\1\uffff\1"+
        "\172\2\uffff\1\144\1\uffff\1\172\1\156\1\145\1\172\1\151\3\uffff"+
        "\1\154\1\uffff\1\55\1\uffff\3\172\1\uffff\1\162\3\uffff\2\172\1"+
        "\157\1\164\1\uffff\1\150\1\154\1\uffff\1\145\1\154\1\uffff\1\164"+
        "\1\172\1\145\1\164\1\55\1\162\1\uffff\1\172\1\155\1\164\1\165\1"+
        "\uffff\2\145\2\157\1\145\1\uffff\1\157\1\145\1\156\1\uffff\1\172"+
        "\1\uffff\2\172\1\uffff\1\157\1\145\4\uffff\1\145\2\uffff\1\156\1"+
        "\141\1\164\1\172\1\156\1\145\1\151\3\uffff\1\55\1\uffff\1\145\1"+
        "\uffff\2\172\1\156\1\144\1\172\1\146\2\156\2\162\1\147\3\uffff\1"+
        "\156\1\172\2\uffff\1\172\1\154\1\151\1\uffff\1\172\1\143\1\157\2"+
        "\uffff\1\156\3\uffff\1\144\1\172\1\uffff\2\172\1\164\1\145\2\172"+
        "\1\141\2\uffff\1\172\1\156\1\uffff\1\164\1\156\1\164\1\55\4\uffff"+
        "\2\172\2\uffff\1\154\1\uffff\1\147\1\145\1\172\1\171\1\172\3\uffff"+
        "\2\172\1\144\1\uffff\1\172\3\uffff\1\172\2\uffff";
    static final String DFA19_acceptS =
        "\5\uffff\1\5\1\7\2\uffff\1\13\2\uffff\1\16\2\uffff\1\21\31\uffff"+
        "\1\144\1\uffff\1\151\1\152\1\153\1\155\4\uffff\1\u00af\2\uffff\1"+
        "\u00b3\1\u00b4\4\uffff\1\u00af\1\uffff\1\2\1\142\1\3\5\uffff\1\5"+
        "\1\7\13\uffff\1\13\3\uffff\1\135\1\15\1\16\10\uffff\1\21\1\uffff"+
        "\1\25\2\uffff\1\26\35\uffff\1\116\1\132\1\66\6\uffff\1\115\1\141"+
        "\1\117\1\154\1\120\1\u0085\1\uffff\1\145\1\126\1\130\1\uffff\1\136"+
        "\1\131\1\137\1\150\1\u0084\1\u00b1\1\u00b2\1\143\1\144\1\147\1\161"+
        "\1\151\1\152\1\153\1\155\3\uffff\1\u00ac\1\uffff\1\u00ad\1\u00ae"+
        "\1\u00b0\1\u00b3\3\uffff\1\60\1\156\1\133\1\134\32\uffff\1\123\1"+
        "\121\13\uffff\1\146\30\uffff\1\166\34\uffff\1\124\1\122\1\140\1"+
        "\127\2\uffff\1\u00ab\40\uffff\1\u0099\12\uffff\1\u00aa\14\uffff"+
        "\1\167\1\170\6\uffff\1\u00a6\11\uffff\1\u0081\2\uffff\1\u008b\3"+
        "\uffff\1\164\2\uffff\1\u0087\11\uffff\1\113\1\174\11\uffff\1\163"+
        "\2\uffff\1\u00a1\6\uffff\1\57\25\uffff\1\105\4\uffff\1\27\2\uffff"+
        "\1\u0088\1\uffff\1\157\5\uffff\1\u0094\10\uffff\1\u00a7\4\uffff"+
        "\1\56\1\64\3\uffff\1\u0091\6\uffff\1\u0096\4\uffff\1\u00a3\1\uffff"+
        "\1\175\5\uffff\1\112\3\uffff\1\54\1\u0083\1\uffff\1\10\1\uffff\1"+
        "\55\5\uffff\1\173\1\u00a5\4\uffff\1\61\7\uffff\1\u008a\1\20\1\uffff"+
        "\1\46\4\uffff\1\75\1\76\1\77\20\uffff\1\u009c\1\u00a4\1\uffff\1"+
        "\50\1\165\1\u0093\3\uffff\1\177\1\65\1\100\1\101\1\102\1\103\1\104"+
        "\1\uffff\1\u0086\2\uffff\1\u009e\2\uffff\1\u0098\1\uffff\1\1\7\uffff"+
        "\1\u0089\1\uffff\1\171\1\uffff\1\47\1\52\1\uffff\1\160\5\uffff\1"+
        "\14\1\u009b\1\17\1\uffff\1\u0080\1\uffff\1\22\3\uffff\1\u009d\1"+
        "\uffff\1\u009a\1\u00a2\1\36\4\uffff\1\51\2\uffff\1\43\2\uffff\1"+
        "\u008c\6\uffff\1\176\4\uffff\1\u008d\5\uffff\1\u0090\3\uffff\1\42"+
        "\1\uffff\1\11\2\uffff\1\33\2\uffff\1\32\1\110\1\23\1\24\1\uffff"+
        "\1\34\1\67\7\uffff\1\162\1\u0097\1\u00a0\1\uffff\1\u0092\1\uffff"+
        "\1\u0082\13\uffff\1\106\1\12\1\30\2\uffff\1\u0095\1\u009f\3\uffff"+
        "\1\41\3\uffff\1\u00a9\1\u00a8\1\uffff\1\u008e\1\73\1\70\2\uffff"+
        "\1\44\7\uffff\1\31\1\172\2\uffff\1\u008f\4\uffff\1\111\1\125\1\6"+
        "\1\4\2\uffff\1\63\1\37\1\uffff\1\40\5\uffff\1\72\1\35\1\62\3\uffff"+
        "\1\45\1\uffff\1\114\1\53\1\74\1\uffff\1\71\1\107";
    static final String DFA19_specialS =
        "\1\1\63\uffff\1\2\1\0\u02a7\uffff}>";
    static final String[] DFA19_transitionS = {
            "\11\67\2\66\2\67\1\66\22\67\1\66\1\44\1\64\1\53\1\63\1\51\1"+
            "\43\1\65\1\11\1\17\1\3\1\41\1\14\1\34\1\2\1\50\1\60\11\61\1"+
            "\52\1\56\1\46\1\13\1\45\1\47\1\67\11\63\1\31\7\63\1\40\10\63"+
            "\1\54\1\67\1\55\1\62\1\63\1\67\1\16\1\36\1\4\1\27\1\23\1\33"+
            "\1\35\1\24\1\1\2\63\1\22\1\26\1\57\1\12\1\10\1\63\1\15\1\7\1"+
            "\32\1\37\1\25\1\30\1\20\1\21\1\63\1\5\1\42\1\6\uff82\67",
            "\1\72\1\uffff\1\73\6\uffff\1\70\1\71",
            "\1\75",
            "\1\77",
            "\1\103\3\uffff\1\104\11\uffff\1\101\5\uffff\1\102\3\uffff\1"+
            "\105",
            "",
            "",
            "\1\114\2\uffff\1\110\1\113\5\uffff\1\117\1\112\3\uffff\1\111"+
            "\1\116\1\uffff\1\115",
            "\1\120\2\uffff\1\121\2\uffff\1\122",
            "",
            "\1\124\13\uffff\1\125",
            "\1\126\1\127",
            "",
            "\1\132\3\uffff\1\133\3\uffff\1\135\5\uffff\1\134",
            "\1\137\1\uffff\1\136\3\uffff\1\140\1\141",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\16"+
            "\74\1\143\13\74",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\4\74"+
            "\1\146\11\74\1\145\13\74",
            "\1\151\3\uffff\1\152\3\uffff\1\150",
            "\1\153\13\uffff\1\154",
            "\1\156\3\uffff\1\157\5\uffff\1\155",
            "\1\161\3\uffff\1\160",
            "\1\162\7\uffff\1\164\13\uffff\1\163",
            "\1\167\3\uffff\1\165\11\uffff\1\166",
            "\1\171\1\170\10\uffff\1\172",
            "\1\173",
            "\1\u0080\2\uffff\1\176\6\uffff\1\177\2\uffff\1\174\6\uffff"+
            "\1\175",
            "\1\u0081\7\uffff\1\u0083\5\uffff\1\u0082\2\uffff\1\u0084",
            "\1\u0085\1\u0086",
            "\1\u0088",
            "\1\u0089\12\uffff\1\u008b\2\uffff\1\u008a",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u0090",
            "\1\u0092",
            "\1\u0094",
            "\1\u0096",
            "\1\u0098\1\u0099",
            "\1\u009c\13\uffff\1\u009b",
            "\1\u009e\4\uffff\1\u009f",
            "",
            "\1\u00a2",
            "",
            "",
            "",
            "",
            "\1\u00a8\11\uffff\1\u00aa\5\uffff\1\u00a9",
            "\12\u00ac\10\uffff\1\u00ae\1\uffff\3\u00ae\5\uffff\1\u00ae"+
            "\13\uffff\1\u00ab\6\uffff\1\u00ac\2\uffff\1\u00ae\1\uffff\3"+
            "\u00ae\5\uffff\1\u00ae\13\uffff\1\u00ab",
            "\12\u00ac\10\uffff\1\u00ae\1\uffff\3\u00ae\5\uffff\1\u00ae"+
            "\22\uffff\1\u00ac\2\uffff\1\u00ae\1\uffff\3\u00ae\5\uffff\1"+
            "\u00ae",
            "\1\74\34\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\0\u00af",
            "\0\u00af",
            "",
            "",
            "\1\u00b1",
            "\1\u00b3\2\uffff\1\u00b2",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "\1\u00b6",
            "",
            "",
            "",
            "\1\u00ba\1\u00b9\1\u00b8\3\uffff\1\u00bb",
            "\1\u00bc",
            "\1\u00bd\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "",
            "",
            "\1\u00c1",
            "\1\u00c4\20\uffff\1\u00c2\6\uffff\1\u00c3",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00ce\2\uffff\1\u00cd\6\uffff\1\u00cc",
            "\1\u00cf",
            "",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "",
            "",
            "",
            "\1\u00d4",
            "\1\u00d5\1\u00d7\17\uffff\1\u00d6",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00db\3\uffff\1\u00da",
            "\1\u00dc\2\uffff\1\u00dd",
            "\1\u00de",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "\1\u00e0",
            "",
            "\1\u00e1",
            "\1\u00e2\6\uffff\1\u00e3",
            "",
            "\1\u00e5\6\uffff\1\u00e4",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8\6\uffff\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00f0\5\uffff\1\u00ef",
            "\1\u00f2\3\uffff\1\u00f1",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f6\14\uffff\1\u00f5",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\23"+
            "\74\1\u00f7\6\74",
            "\1\u00f9\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u0100\23\uffff\1\u00ff\3\uffff\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107\3\uffff\1\u0108",
            "\1\u0109\5\uffff\1\u010b\3\uffff\1\u010a",
            "\1\u010c",
            "",
            "",
            "",
            "\1\u010d\3\uffff\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111\23\uffff\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0115",
            "",
            "",
            "",
            "\1\u0117",
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
            "",
            "",
            "",
            "\1\u0119",
            "\1\u011a",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "\12\u00ac\10\uffff\1\u00ae\1\uffff\3\u00ae\5\uffff\1\u00ae"+
            "\22\uffff\1\u00ac\2\uffff\1\u00ae\1\uffff\3\u00ae\5\uffff\1"+
            "\u00ae",
            "",
            "",
            "",
            "",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "",
            "",
            "",
            "",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "",
            "",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152\4\uffff\1\u0153",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160\7\uffff\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u0167",
            "\1\u0168",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u016e",
            "\1\u016f",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u0171",
            "\1\u0172\24\uffff\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "",
            "",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u017c",
            "",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u0186",
            "\1\u0187",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\74\10\uffff\1\u018e\2\uffff\12\74\7\uffff\32\74\4\uffff"+
            "\1\74\1\uffff\32\74",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0197\4\uffff\1\u0196",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "",
            "\1\74\10\uffff\1\u01a9\2\uffff\12\74\7\uffff\32\74\4\uffff"+
            "\1\74\1\uffff\32\74",
            "\1\u01ab",
            "\1\u01ac",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u01ae",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "",
            "",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "",
            "\1\u01bc",
            "\1\74\10\uffff\1\u01bd\2\uffff\12\74\7\uffff\32\74\4\uffff"+
            "\1\74\1\uffff\32\74",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u01c5",
            "",
            "\1\u01c6",
            "\1\u01c7",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u01c9",
            "\1\u01ca",
            "",
            "\1\u01cb",
            "\1\u01cc",
            "",
            "\1\u01cd",
            "\1\u01ce",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u01d0",
            "\1\u01d1",
            "\1\u01d2",
            "\1\u01d3",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u01d5",
            "",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "\1\u01db",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u01dd",
            "\1\74\13\uffff\12\74\7\uffff\1\u01df\1\u01de\30\74\4\uffff"+
            "\1\74\1\uffff\32\74",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u01e2",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u01e4",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u01e6",
            "\1\u01e7",
            "\1\u01e8",
            "",
            "\1\u01e9",
            "\1\u01ea",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u01ed",
            "\1\u01ee",
            "\1\u01ef",
            "\1\u01f0",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u01f2",
            "\1\u01f3",
            "\1\u01f4",
            "\1\u01f5",
            "\1\u01f6",
            "\1\u01f7",
            "\1\u01f8",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u01fb",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u01fd",
            "",
            "\1\u01fe",
            "\1\u01ff",
            "\1\u0200",
            "\1\u0201\17\uffff\1\u0203\3\uffff\1\u0202",
            "",
            "\1\u0204",
            "\1\u0205",
            "",
            "\1\u0206",
            "",
            "\1\u0207\16\uffff\1\u0208",
            "\1\u0209",
            "\1\u020a",
            "\1\u020b",
            "\1\u020c",
            "",
            "\1\u020d",
            "\1\u020e",
            "\1\u020f",
            "\1\u0210",
            "\1\u0211",
            "\1\u0212",
            "\1\u0215\4\uffff\1\u0213\7\uffff\1\u0214",
            "\1\u0216",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u021a",
            "",
            "",
            "\1\u021b",
            "\1\u021c",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u0223\1\u0220\5\uffff\1\u0222\4\uffff\1\u021f\4\uffff\1"+
            "\u0221",
            "\1\u0224",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u0226",
            "\1\u0227",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u0229",
            "\1\u022a",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "\1\u022c",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u022e",
            "\1\u022f",
            "\1\u0230",
            "\1\u0231",
            "",
            "\1\u0232",
            "\1\u0233",
            "\1\u0234",
            "",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "\1\u0236",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u0238",
            "\1\u023a\7\uffff\1\u0239",
            "\1\u023b",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "",
            "\1\u023d",
            "\1\u023e",
            "\1\u023f",
            "\1\u0240",
            "",
            "\1\u0241",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u0245",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u0247",
            "",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "\1\u0249",
            "\1\u024a",
            "\1\u024b",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "",
            "",
            "\1\u024f\4\uffff\1\u024d\7\uffff\1\u024e",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u0251",
            "\1\u0252",
            "\1\u0253",
            "\1\u0254",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u0256",
            "\1\u0257",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u0259",
            "\1\u025a",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u025c",
            "\1\u025d",
            "\1\u025e",
            "",
            "",
            "\1\u025f",
            "",
            "",
            "",
            "\1\u0260",
            "\1\u0261",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0263",
            "",
            "\1\u0264",
            "\1\u0265",
            "",
            "\1\u0266",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "\1\u0268",
            "",
            "\1\u0269",
            "\1\u026a",
            "\1\u026b",
            "\1\u026c",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u026e",
            "\1\u026f",
            "",
            "\1\u0270",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "",
            "\1\u0272",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u0274",
            "\1\u0275",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u0277",
            "",
            "",
            "",
            "\1\u0278",
            "",
            "\1\u0279",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "\1\u027d",
            "",
            "",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u0280",
            "\1\u0281",
            "",
            "\1\u0282",
            "\1\u0283",
            "",
            "\1\u0284",
            "\1\u0285",
            "",
            "\1\u0286",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u0288\3\uffff\1\u0289",
            "\1\u028a",
            "\1\u028b",
            "\1\u028c",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u028e",
            "\1\u028f",
            "\1\u0290",
            "",
            "\1\u0291",
            "\1\u0292",
            "\1\u0293",
            "\1\u0294",
            "\1\u0295",
            "",
            "\1\u0296",
            "\1\u0297",
            "\1\u0298",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "\1\u029c",
            "\1\u029d",
            "",
            "",
            "",
            "",
            "\1\u029e\3\uffff\1\u029f",
            "",
            "",
            "\1\u02a0",
            "\1\u02a1",
            "\1\u02a2",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u02a4",
            "\1\u02a5",
            "\1\u02a6",
            "",
            "",
            "",
            "\1\u02a7",
            "",
            "\1\u02a9",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\74\10\uffff\1\u02ab\2\uffff\12\74\7\uffff\32\74\4\uffff"+
            "\1\74\1\uffff\32\74",
            "\1\u02ad",
            "\1\u02ae",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u02b0",
            "\1\u02b1",
            "\1\u02b2",
            "\1\u02b3",
            "\1\u02b4",
            "\1\u02b5",
            "",
            "",
            "",
            "\1\u02b6",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u02b9",
            "\1\u02ba",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u02bc",
            "\1\u02bd",
            "",
            "",
            "\1\u02be",
            "",
            "",
            "",
            "\1\u02bf",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\74\10\uffff\1\u02c2\2\uffff\12\74\7\uffff\32\74\4\uffff"+
            "\1\74\1\uffff\32\74",
            "\1\u02c4",
            "\1\u02c5",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u02c8",
            "",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u02ca",
            "",
            "\1\u02cb",
            "\1\u02cc",
            "\1\u02cd\20\uffff\1\u02ce",
            "\1\u02cf",
            "",
            "",
            "",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "",
            "\1\u02d2",
            "",
            "\1\u02d3",
            "\1\u02d4",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u02d6",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u02da",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    static class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | T__183 | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_53 = input.LA(1);

                        s = -1;
                        if ( ((LA19_53>='\u0000' && LA19_53<='\uFFFF')) ) {s = 175;}

                        else s = 55;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_0 = input.LA(1);

                        s = -1;
                        if ( (LA19_0=='i') ) {s = 1;}

                        else if ( (LA19_0=='.') ) {s = 2;}

                        else if ( (LA19_0=='*') ) {s = 3;}

                        else if ( (LA19_0=='c') ) {s = 4;}

                        else if ( (LA19_0=='{') ) {s = 5;}

                        else if ( (LA19_0=='}') ) {s = 6;}

                        else if ( (LA19_0=='s') ) {s = 7;}

                        else if ( (LA19_0=='p') ) {s = 8;}

                        else if ( (LA19_0=='(') ) {s = 9;}

                        else if ( (LA19_0=='o') ) {s = 10;}

                        else if ( (LA19_0=='=') ) {s = 11;}

                        else if ( (LA19_0==',') ) {s = 12;}

                        else if ( (LA19_0=='r') ) {s = 13;}

                        else if ( (LA19_0=='a') ) {s = 14;}

                        else if ( (LA19_0==')') ) {s = 15;}

                        else if ( (LA19_0=='x') ) {s = 16;}

                        else if ( (LA19_0=='y') ) {s = 17;}

                        else if ( (LA19_0=='l') ) {s = 18;}

                        else if ( (LA19_0=='e') ) {s = 19;}

                        else if ( (LA19_0=='h') ) {s = 20;}

                        else if ( (LA19_0=='v') ) {s = 21;}

                        else if ( (LA19_0=='m') ) {s = 22;}

                        else if ( (LA19_0=='d') ) {s = 23;}

                        else if ( (LA19_0=='w') ) {s = 24;}

                        else if ( (LA19_0=='J') ) {s = 25;}

                        else if ( (LA19_0=='t') ) {s = 26;}

                        else if ( (LA19_0=='f') ) {s = 27;}

                        else if ( (LA19_0=='-') ) {s = 28;}

                        else if ( (LA19_0=='g') ) {s = 29;}

                        else if ( (LA19_0=='b') ) {s = 30;}

                        else if ( (LA19_0=='u') ) {s = 31;}

                        else if ( (LA19_0=='R') ) {s = 32;}

                        else if ( (LA19_0=='+') ) {s = 33;}

                        else if ( (LA19_0=='|') ) {s = 34;}

                        else if ( (LA19_0=='&') ) {s = 35;}

                        else if ( (LA19_0=='!') ) {s = 36;}

                        else if ( (LA19_0=='>') ) {s = 37;}

                        else if ( (LA19_0=='<') ) {s = 38;}

                        else if ( (LA19_0=='?') ) {s = 39;}

                        else if ( (LA19_0=='/') ) {s = 40;}

                        else if ( (LA19_0=='%') ) {s = 41;}

                        else if ( (LA19_0==':') ) {s = 42;}

                        else if ( (LA19_0=='#') ) {s = 43;}

                        else if ( (LA19_0=='[') ) {s = 44;}

                        else if ( (LA19_0==']') ) {s = 45;}

                        else if ( (LA19_0==';') ) {s = 46;}

                        else if ( (LA19_0=='n') ) {s = 47;}

                        else if ( (LA19_0=='0') ) {s = 48;}

                        else if ( ((LA19_0>='1' && LA19_0<='9')) ) {s = 49;}

                        else if ( (LA19_0=='^') ) {s = 50;}

                        else if ( (LA19_0=='$'||(LA19_0>='A' && LA19_0<='I')||(LA19_0>='K' && LA19_0<='Q')||(LA19_0>='S' && LA19_0<='Z')||LA19_0=='_'||(LA19_0>='j' && LA19_0<='k')||LA19_0=='q'||LA19_0=='z') ) {s = 51;}

                        else if ( (LA19_0=='\"') ) {s = 52;}

                        else if ( (LA19_0=='\'') ) {s = 53;}

                        else if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {s = 54;}

                        else if ( ((LA19_0>='\u0000' && LA19_0<='\b')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\u001F')||LA19_0=='@'||LA19_0=='\\'||LA19_0=='`'||(LA19_0>='~' && LA19_0<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_52 = input.LA(1);

                        s = -1;
                        if ( ((LA19_52>='\u0000' && LA19_52<='\uFFFF')) ) {s = 175;}

                        else s = 55;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}