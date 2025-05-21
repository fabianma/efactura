
package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.InstructionIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.InstructionNoteType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PaymentChannelCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PaymentDueDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PaymentIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PaymentMeansCodeType;


/**
 * <p>Java class for PaymentMeansType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PaymentMeansType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentMeansCode"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentDueDate" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentChannelCode" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InstructionID" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InstructionNote" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentID" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CardAccount" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PayerFinancialAccount" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PayeeFinancialAccount" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CreditAccount" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PaymentMandate" minOccurs="0"/>
 *         <element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TradeFinancing" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentMeansType", propOrder = {
    "id",
    "paymentMeansCode",
    "paymentDueDate",
    "paymentChannelCode",
    "instructionID",
    "instructionNote",
    "paymentID",
    "cardAccount",
    "payerFinancialAccount",
    "payeeFinancialAccount",
    "creditAccount",
    "paymentMandate",
    "tradeFinancing"
})
public class PaymentMeansType {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "PaymentMeansCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected PaymentMeansCodeType paymentMeansCode;
    @XmlElement(name = "PaymentDueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PaymentDueDateType paymentDueDate;
    @XmlElement(name = "PaymentChannelCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PaymentChannelCodeType paymentChannelCode;
    @XmlElement(name = "InstructionID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected InstructionIDType instructionID;
    @XmlElement(name = "InstructionNote", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<InstructionNoteType> instructionNote;
    @XmlElement(name = "PaymentID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<PaymentIDType> paymentID;
    @XmlElement(name = "CardAccount")
    protected CardAccountType cardAccount;
    @XmlElement(name = "PayerFinancialAccount")
    protected FinancialAccountType payerFinancialAccount;
    @XmlElement(name = "PayeeFinancialAccount")
    protected FinancialAccountType payeeFinancialAccount;
    @XmlElement(name = "CreditAccount")
    protected CreditAccountType creditAccount;
    @XmlElement(name = "PaymentMandate")
    protected PaymentMandateType paymentMandate;
    @XmlElement(name = "TradeFinancing")
    protected TradeFinancingType tradeFinancing;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setID(IDType value) {
        this.id = value;
    }

    /**
     * Gets the value of the paymentMeansCode property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMeansCodeType }
     *     
     */
    public PaymentMeansCodeType getPaymentMeansCode() {
        return paymentMeansCode;
    }

    /**
     * Sets the value of the paymentMeansCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMeansCodeType }
     *     
     */
    public void setPaymentMeansCode(PaymentMeansCodeType value) {
        this.paymentMeansCode = value;
    }

    /**
     * Gets the value of the paymentDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDueDateType }
     *     
     */
    public PaymentDueDateType getPaymentDueDate() {
        return paymentDueDate;
    }

    /**
     * Sets the value of the paymentDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDueDateType }
     *     
     */
    public void setPaymentDueDate(PaymentDueDateType value) {
        this.paymentDueDate = value;
    }

    /**
     * Gets the value of the paymentChannelCode property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentChannelCodeType }
     *     
     */
    public PaymentChannelCodeType getPaymentChannelCode() {
        return paymentChannelCode;
    }

    /**
     * Sets the value of the paymentChannelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentChannelCodeType }
     *     
     */
    public void setPaymentChannelCode(PaymentChannelCodeType value) {
        this.paymentChannelCode = value;
    }

    /**
     * Gets the value of the instructionID property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionIDType }
     *     
     */
    public InstructionIDType getInstructionID() {
        return instructionID;
    }

    /**
     * Sets the value of the instructionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionIDType }
     *     
     */
    public void setInstructionID(InstructionIDType value) {
        this.instructionID = value;
    }

    /**
     * Gets the value of the instructionNote property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instructionNote property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getInstructionNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstructionNoteType }
     * </p>
     * 
     * 
     * @return
     *     The value of the instructionNote property.
     */
    public List<InstructionNoteType> getInstructionNote() {
        if (instructionNote == null) {
            instructionNote = new ArrayList<>();
        }
        return this.instructionNote;
    }

    /**
     * Gets the value of the paymentID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPaymentID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentIDType }
     * </p>
     * 
     * 
     * @return
     *     The value of the paymentID property.
     */
    public List<PaymentIDType> getPaymentID() {
        if (paymentID == null) {
            paymentID = new ArrayList<>();
        }
        return this.paymentID;
    }

    /**
     * Gets the value of the cardAccount property.
     * 
     * @return
     *     possible object is
     *     {@link CardAccountType }
     *     
     */
    public CardAccountType getCardAccount() {
        return cardAccount;
    }

    /**
     * Sets the value of the cardAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAccountType }
     *     
     */
    public void setCardAccount(CardAccountType value) {
        this.cardAccount = value;
    }

    /**
     * Gets the value of the payerFinancialAccount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAccountType }
     *     
     */
    public FinancialAccountType getPayerFinancialAccount() {
        return payerFinancialAccount;
    }

    /**
     * Sets the value of the payerFinancialAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAccountType }
     *     
     */
    public void setPayerFinancialAccount(FinancialAccountType value) {
        this.payerFinancialAccount = value;
    }

    /**
     * Gets the value of the payeeFinancialAccount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAccountType }
     *     
     */
    public FinancialAccountType getPayeeFinancialAccount() {
        return payeeFinancialAccount;
    }

    /**
     * Sets the value of the payeeFinancialAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAccountType }
     *     
     */
    public void setPayeeFinancialAccount(FinancialAccountType value) {
        this.payeeFinancialAccount = value;
    }

    /**
     * Gets the value of the creditAccount property.
     * 
     * @return
     *     possible object is
     *     {@link CreditAccountType }
     *     
     */
    public CreditAccountType getCreditAccount() {
        return creditAccount;
    }

    /**
     * Sets the value of the creditAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditAccountType }
     *     
     */
    public void setCreditAccount(CreditAccountType value) {
        this.creditAccount = value;
    }

    /**
     * Gets the value of the paymentMandate property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMandateType }
     *     
     */
    public PaymentMandateType getPaymentMandate() {
        return paymentMandate;
    }

    /**
     * Sets the value of the paymentMandate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMandateType }
     *     
     */
    public void setPaymentMandate(PaymentMandateType value) {
        this.paymentMandate = value;
    }

    /**
     * Gets the value of the tradeFinancing property.
     * 
     * @return
     *     possible object is
     *     {@link TradeFinancingType }
     *     
     */
    public TradeFinancingType getTradeFinancing() {
        return tradeFinancing;
    }

    /**
     * Sets the value of the tradeFinancing property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeFinancingType }
     *     
     */
    public void setTradeFinancing(TradeFinancingType value) {
        this.tradeFinancing = value;
    }

}
