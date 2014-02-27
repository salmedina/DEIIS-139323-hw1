

/* First created by JCasGen Thu Feb 27 02:28:40 CST 2014 */
package Parser;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.jcas.cas.StringArray;


/** Contains the list of answers given from the input file

 * Updated by JCasGen Thu Feb 27 02:41:05 CST 2014
 * XML source: E:/MCC/Semester 4/IIS/Workspace/hw1-139323/typeSystemDescriptor.xml
 * @generated */
public class Answers extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Answers.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Answers() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Answers(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Answers(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Answers(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: Text

  /** getter for Text - gets Contains the list of questions found in the input file
   * @generated
   * @return value of the feature 
   */
  public StringArray getText() {
    if (Answers_Type.featOkTst && ((Answers_Type)jcasType).casFeat_Text == null)
      jcasType.jcas.throwFeatMissing("Text", "Parser.Answers");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answers_Type)jcasType).casFeatCode_Text)));}
    
  /** setter for Text - sets Contains the list of questions found in the input file 
   * @generated
   * @param v value to set into the feature 
   */
  public void setText(StringArray v) {
    if (Answers_Type.featOkTst && ((Answers_Type)jcasType).casFeat_Text == null)
      jcasType.jcas.throwFeatMissing("Text", "Parser.Answers");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answers_Type)jcasType).casFeatCode_Text, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for Text - gets an indexed value - Contains the list of questions found in the input file
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getText(int i) {
    if (Answers_Type.featOkTst && ((Answers_Type)jcasType).casFeat_Text == null)
      jcasType.jcas.throwFeatMissing("Text", "Parser.Answers");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answers_Type)jcasType).casFeatCode_Text), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answers_Type)jcasType).casFeatCode_Text), i);}

  /** indexed setter for Text - sets an indexed value - Contains the list of questions found in the input file
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setText(int i, String v) { 
    if (Answers_Type.featOkTst && ((Answers_Type)jcasType).casFeat_Text == null)
      jcasType.jcas.throwFeatMissing("Text", "Parser.Answers");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answers_Type)jcasType).casFeatCode_Text), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answers_Type)jcasType).casFeatCode_Text), i, v);}
  }

    