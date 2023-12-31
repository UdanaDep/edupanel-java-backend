package lk.ijse.dep11.app.api;

import lk.ijse.dep11.app.to.request.LecturerReqTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/lectures")
@RestController
@CrossOrigin
public class LectureHttpController {
    @ResponseStatus(HttpStatus.CREATED)

    @PostMapping(consumes = "multipart/form-data",produces = "application/json")
    public void createNewLecturer(@ModelAttribute LecturerReqTO lecturer){
        System.out.println(lecturer);
        System.out.println("create Lectures");

    }

    @PatchMapping
    public void updateLecturerDetails(){
        System.out.println("update Lectures");

    }

     @DeleteMapping
    public void deleteLecturerDetails(){
         System.out.println("delete Lectures");

    }

    @GetMapping
    public  void getALlLecturers(){
        System.out.println("getAll Lectures");

    }

}
