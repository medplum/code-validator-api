package org.sitenv.vocabularies.configuration;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Brian on 2/10/2016.
 */
@XmlRootElement(name = "configurations")
@XmlAccessorType(XmlAccessType.FIELD)
public class Configurations {
    @XmlElement(name="expression")
    private List<ConfiguredExpression> expressions = null;

    public List<ConfiguredExpression> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<ConfiguredExpression> expressions) {
        this.expressions = expressions;
    }
}
