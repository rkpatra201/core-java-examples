import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

public class MethodParameterInfo {
    private String id;
    private String fqClassName;
    private List<String> typeArgumentsFqClassName = Collections.emptyList();
    private Type parameterType;
    private boolean required;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFqClassName() {
        return fqClassName;
    }

    public void setFqClassName(String fqClassName) {
        this.fqClassName = fqClassName;
    }

    public List<String> getTypeArgumentsFqClassName() {
        return typeArgumentsFqClassName;
    }

    public void setTypeArgumentsFqClassName(List<String> typeArgumentsFqClassName) {
        this.typeArgumentsFqClassName = typeArgumentsFqClassName;
    }

    public Type getParameterType() {
        return parameterType;
    }

    public void setParameterType(Type parameterType) {
        this.parameterType = parameterType;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }
}
