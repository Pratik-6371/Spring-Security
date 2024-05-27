package PratikAppSecurity.SpringSecurityProject.Controller;

import PratikAppSecurity.SpringSecurityProject.Model.Notice;
import PratikAppSecurity.SpringSecurityProject.Repository.NoticeRepository;
import ch.qos.logback.core.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@RestController
public class NoticesController {
    @Autowired
    private NoticeRepository noticeRepository;

    @GetMapping("/notices")
    public ResponseEntity<?> getNotice() {
        List<Notice> notices = noticeRepository.findAllActiveNotices();
        if (notices != null) {
            return ResponseEntity.ok()
                    .cacheControl(CacheControl.maxAge(60, TimeUnit.SECONDS))
                    .body(notices);
        } else {
            Map<String, String> response = new HashMap<>();
            response.put("message", "There are no active notices at the moment.");
            return ResponseEntity.ok(response);
        }

    }
}
