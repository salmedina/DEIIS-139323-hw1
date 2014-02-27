

/* First created by JCasGen Thu Feb 27 02:28:40 CST 2014 */
package Analyzer;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Contains the result according to the configuration of the CAS
 * Updated by JCasGen Thu Feb 27 02:41:05 CST 2014
 * XML source: E:/MCC/Semester 4/IIS/Workspace/hw1-139323/typeSystemDescriptor.xml
 * @generated */
public class Result extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Result.class);
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
  protected Result() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Result(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Result(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Result(JCas jcas, int begin, int end) {
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
  //* Feature: N

  /** getter for N - gets Number of top answers considered to measure precision
   * @generated
   * @return value of the feature 
   */
  public int getN() {
    if (Result_Type.featOkTst && ((Result_Type)jcasType).casFeat_N == null)
      jcasType.jcas.throwFeatMissing("N", "Analyzer.Result");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Result_Type)jcasType).casFeatCode_N);}
    
  /** setter for N - sets Number of top answers considered to measure precision 
   * @generated
   * @param v value to set into the feature 
   */
  public void setN(int v) {
    if (Result_Type.featOkTst && ((Result_Type)jcasType).casFeat_N == null)
      jcasType.jcas.throwFeatMissing("N", "Analyzer.Result");
    jcasType.ll_cas.ll_setIntValue(addr, ((Result_Type)jcasType).casFeatCode_N, v);}    
   
    
  //*--------------*
  //* Feature: Precision

  /** getter for Precision - gets Precision obtained through the method
Precision = OK_ANSWERS/TOP_N_ANSWERS
   * @generated
   * @return value of the feature 
   */
  public double getPrecision() {
    if (Result_Type.featOkTst && ((Result_Type)jcasType).casFeat_Precision == null)
      jcasType.jcas.throwFeatMissing("Precision", "Analyzer.Result");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Result_Type)jcasType).casFeatCode_Precision);}
    
  /** setter for Precision - sets Precision obtained through the method
Precision = OK_ANSWERS/TOP_N_ANSWERS 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPrecision(double v) {
    if (Result_Type.featOkTst && ((Result_Type)jcasType).casFeat_Precision == null)
      jcasType.jcas.throwFeatMissing("Precision", "Analyzer.Result");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Result_Type)jcasType).casFeatCode_Precision, v);}    
  }

    