

/* First created by JCasGen Thu Feb 27 02:28:40 CST 2014 */
package In;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Contains the text from the input file
 * Updated by JCasGen Thu Feb 27 02:41:05 CST 2014
 * XML source: E:/MCC/Semester 4/IIS/Workspace/hw1-139323/typeSystemDescriptor.xml
 * @generated */
public class Input extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Input.class);
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
  protected Input() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Input(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Input(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Input(JCas jcas, int begin, int end) {
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

  /** getter for Text - gets Contains the original text
   * @generated
   * @return value of the feature 
   */
  public String getText() {
    if (Input_Type.featOkTst && ((Input_Type)jcasType).casFeat_Text == null)
      jcasType.jcas.throwFeatMissing("Text", "In.Input");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Input_Type)jcasType).casFeatCode_Text);}
    
  /** setter for Text - sets Contains the original text 
   * @generated
   * @param v value to set into the feature 
   */
  public void setText(String v) {
    if (Input_Type.featOkTst && ((Input_Type)jcasType).casFeat_Text == null)
      jcasType.jcas.throwFeatMissing("Text", "In.Input");
    jcasType.ll_cas.ll_setStringValue(addr, ((Input_Type)jcasType).casFeatCode_Text, v);}    
  }

    