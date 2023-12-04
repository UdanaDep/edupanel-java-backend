package lk.ijse.dep11.app.api;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/lectures/part-time")
@RestController
@CrossOrigin
public class PartlTimeLectureHttpController {

    @PostMapping
    public void arrangePartTimeLecturerOrder() {
        System.out.println("arrange PartTime LecturereOrder()");

    }

    @GetMapping
    public void getAllPartTimeLecturers() {
        System.out.println("getAllPartlTimeLecturers()");


    }
}