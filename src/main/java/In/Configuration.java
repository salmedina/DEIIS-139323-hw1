

/* First created by JCasGen Thu Feb 27 02:41:05 CST 2014 */
package In;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** The parameters to configure the CAS:
1) N-Gram size

 * Updated by JCasGen Thu Feb 27 02:41:05 CST 2014
 * XML source: E:/MCC/Semester 4/IIS/Workspace/hw1-139323/typeSystemDescriptor.xml
 * @generated */
public class Configuration extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Configuration.class);
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
  protected Configuration() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Configuration(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Configuration(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Configuration(JCas jcas, int begin, int end) {
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
  //* Feature: NGramSize

  /** getter for NGramSize - gets Size of N-Grams to compare
   * @generated
   * @return value of the feature 
   */
  public int getNGramSize() {
    if (Configuration_Type.featOkTst && ((Configuration_Type)jcasType).casFeat_NGramSize == null)
      jcasType.jcas.throwFeatMissing("NGramSize", "In.Configuration");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Configuration_Type)jcasType).casFeatCode_NGramSize);}
    
  /** setter for NGramSize - sets Size of N-Grams to compare 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNGramSize(int v) {
    if (Configuration_Type.featOkTst && ((Configuration_Type)jcasType).casFeat_NGramSize == null)
      jcasType.jcas.throwFeatMissing("NGramSize", "In.Configuration");
    jcasType.ll_cas.ll_setIntValue(addr, ((Configuration_Type)jcasType).casFeatCode_NGramSize, v);}    
  }

    