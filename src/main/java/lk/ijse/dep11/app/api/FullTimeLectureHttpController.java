package lk.ijse.dep11.app.api;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/lectures/full-time")
@RestController
@CrossOrigin
public class FullTimeLectureHttpController {
    @PostMapping
    public  void arrangeFullTimeLecturerOrder(){
        System.out.println("arrange FullTime LecturereOrder()");

    }
    @GetMapping
    public  void getAllFullTimeLecturers(){
        System.out.println("getAllFullTimeLecturers()");

    }

}
