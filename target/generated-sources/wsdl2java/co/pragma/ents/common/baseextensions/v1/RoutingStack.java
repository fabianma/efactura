
package co.pragma.ents.common.baseextensions.v1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoutingStack complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RoutingStack">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="routeTo" type="{http://pragma.co/ents/common/BaseExtensions/V1.0}RouteData" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutingStack", propOrder = {
    "routeTo"
})
public class RoutingStack {

    protected List<RouteData> routeTo;

    /**
     * Gets the value of the routeTo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeTo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRouteTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteData }
     * </p>
     * 
     * 
     * @return
     *     The value of the routeTo property.
     */
    public List<RouteData> getRouteTo() {
        if (routeTo == null) {
            routeTo = new ArrayList<>();
        }
        return this.routeTo;
    }

}
