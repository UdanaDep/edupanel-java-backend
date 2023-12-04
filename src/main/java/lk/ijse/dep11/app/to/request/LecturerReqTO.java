package lk.ijse.dep11.app.to.request;

import lk.ijse.dep11.app.validation.LecturerImage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class LecturerReqTO {
    @NotBlank(message = "Name cant be empty")
    @Pattern(regexp = "^[A-Za-z]+$",message = "Invalid name")
    private String name;
    @NotBlank(message = "Designnation cant be empty")
    @Length(min=2,message = "Invalid Designation")
    private String designation;

    @NotBlank(message = "Name cant be empty")
    @Length(min=2,message = "Invalid Qualification")
    private String qualifications;
    @NotBlank(message = "Name cant be empty")
    @Pattern(regexp = "^(full-time|part-time)$",flags = Pattern.Flag.CASE_INSENSITIVE,message = "Invalid Type")
    private  String type;

    @LecturerImage
     private MultipartFile picutre;

    @Pattern(regexp = "^http[s]?://.+$",message = "Invalid Url")
    private String Linkedin;

}
