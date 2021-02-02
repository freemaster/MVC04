package kr.smhrd.controller;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import kr.smhrd.model.MemberVO;

public class jsonTest {
    public static void main(String[] args) {
        //JSON API : Gson
        MemberVO vo = new MemberVO();
        /*
        vo.setId("admin");
        vo.setMname("관리자");
        vo.setMemail("admin@admin.com");
        vo.setMage(20);
        vo.setMtel("010-1111-2222");
        
        Gson g = new Gson();
        String json = g.toJson(vo);
        System.out.println(json);
        */
        // ArrayList에 팀원들의 정보를 저장하고 json으로 출력
        List<MemberVO> list = new ArrayList<MemberVO>();
        
        String[] mName = {"장승원", "여진호", "김명훈", "박양주", "김민관"};
        int[] num = {1, 2, 3, 4, 5};
        int[] mAge = {10, 11, 12, 13, 14};
        String[] mEmail = {"admin@amidn.com", "admin1@amidn.com", "admin2@amidn.com", "admin3@amidn.com", "admin4@amidn.com"};
        String[] mPhone = {"010-111-2222", "010-2222-2222", "010-3333-2222", "010-4444-2222", "010-5555-2222"};
        String[] id = {"admin1", "admin2", "admin3", "admin4", "admin4"};
        
        for(int i=0; i<5; i++) {
            vo.setId(id[i]);
            vo.setMname(mName[i]);
            vo.setMemail(mEmail[i]);
            vo.setMage(mAge[i]);
            vo.setMtel(mPhone[i]);
            list.add(vo);
        }
          
        Gson g = new Gson();
        String json = g.toJson(list);
        System.out.println(json);
        
    }
}
