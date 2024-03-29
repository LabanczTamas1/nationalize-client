package nationalize;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@lombok.Data
public class Nationality {

    private long count;
    private String name;




   @lombok.Data
    public static class Country {

        private String countryId;
        private float probability;


        @Override
        public String toString() {
            return ReflectionToStringBuilder.toString(this, ToStringStyle.NO_CLASS_NAME_STYLE);
        }

    }
    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.NO_CLASS_NAME_STYLE);
    }

}
