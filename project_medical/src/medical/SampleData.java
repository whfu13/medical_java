package medical;

import java.util.ArrayList;

public class SampleData {
	
	// 지역 코드
	// 1 : 강남구, 2 : 강동구, 3 : 강북구, 4 : 강서구, 5 : 관악구, 6 : 광진구,
	// 7 : 구로구, 8 : 금천구, 9 : 노원구, 10: 도봉구, 11: 동대문구, 12 : 동작구,
	// 13 : 마포구, 14 : 서대문구, 15 : 서초구, 16 : 성동구, 17 : 성북구, 18 : 송파구,
	// 19 : 양천구, 20 : 영등포구, 21 : 용산구, 22 : 은평구, 23 : 종로구, 24 : 중구,
	// 25 : 중랑구, 26 : 인천, 27 : 경기 북부, 28 : 경기 남부, 29 : 경기 서부, 30 : 경기 동부

	// 시설 코드 예시
	// 1 : 요양원, 2 : 요양병원 3 : 실버타운
	
	private String name;
	private String address;
	private int facility_code;
	private int region_code;
	
	SampleData(){
		
	}
	
	SampleData(String name, String address, int facility_code, int region_code){
		this.name = name;
		this.address = address;
		this.facility_code = facility_code;
		this.region_code = region_code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getFacility_code() {
		return facility_code;
	}

	public void setFacility_code(int facility_code) {
		this.facility_code = facility_code;
	}

	public int getRegion_code() {
		return region_code;
	}

	public void setRegion_code(int region_code) {
		this.region_code = region_code;
	}
	
	public ArrayList<SampleData> get_dataset(){

		ArrayList<SampleData> dataset = new ArrayList<SampleData>();
		
		dataset.add(new SampleData("청운노인요양원", "서울특별시 종로구 비봉길 76", 1, 23));
		dataset.add(new SampleData("인자인케어센터", "서울특별시 종로구 평창17길 26", 1, 23));
		dataset.add(new SampleData("구립중구노인요양센터", "서울특별시 중구 필동로 96", 1, 23));
		dataset.add(new SampleData("워커힐실버타운", "서울 광진구 워커힐로 93", 3, 6));
		dataset.add(new SampleData("삼성홈실버타운", "서울 도봉구 도봉로180길 46", 3, 10));
		dataset.add(new SampleData("원불교하이원빌리지", "서울 용산구 한강대로40가길 24", 3, 21));
		dataset.add(new SampleData("성라실버타운", "서울 성북구 성북로31길 27", 3, 17));
		dataset.add(new SampleData("서울숲 요양원", "서울특별시 성동구 뚝섬로 401-2 4층", 1, 16));
		dataset.add(new SampleData("광진노인보호센터", "서울 광진구 뚝섬로58길 13 ", 1, 6));
		dataset.add(new SampleData("광진섬김주간보호센터", "서울 광진구 구의강변로 35", 1, 6));
		dataset.add(new SampleData("포레스트한방병원 강동", "서울 강동구 강동대로 143-52", 2, 2));
		dataset.add(new SampleData("메디움강남요양병원", "서울 강남구 강남대로 276", 2, 1));
		dataset.add(new SampleData("서울힐링요양병원", "서울 송파구 중대로 191", 2, 18));
		dataset.add(new SampleData("더드림요양병원", "서울 동대문구 한빛로 12", 2, 11));
		dataset.add(new SampleData("동서요양병원", "서울 성북구 동소문로 306", 2, 17));
		dataset.add(new SampleData("서울센트럴요양병원", "서울 영등포구 경인로 767", 2, 20));
		dataset.add(new SampleData("서초프라임요양병원", "서울 서초구 방배천로2길 22", 2, 15));
		dataset.add(new SampleData("서울성모샘의원", "서울 강서구 곰달래로 170 정일빌딩 3층 4, 5, 6층", 2, 4));
		dataset.add(new SampleData("은평요양병원", "서울 은평구 통일로 933", 2, 22));
		dataset.add(new SampleData("강남구립행복요양병원", "서울 강남구 헌릉로590길 60", 2, 1));
		dataset.add(new SampleData("메디컬요양원", "서울특별시 동대문구 약령시로 124 2, 4~10층", 1, 11));
		dataset.add(new SampleData("길재활요양원", "서울특별시 강북구 인수봉로 225", 1, 3));
		dataset.add(new SampleData("큰사랑노인요양원", "서울특별시 도봉구 도봉로152길 26 렉시온프라자", 1, 10));
		dataset.add(new SampleData("송파그랜드요양병원", "서울 송파구 마천로 238 윤진프라자타워", 2, 18));
		dataset.add(new SampleData("제중요양병원", "서울 구로구 새말로 60", 2, 7));
		dataset.add(new SampleData("선의요양병원", "서울 노원구 동일로 1419 디와이홀딩스 빌딩 8-11층", 2, 9));
		dataset.add(new SampleData("부천요양병원", "경기 부천시 원미구 길주로 321", 2, 29));
		dataset.add(new SampleData("한국효요양병원", "서울 은평구 은평로 170 상현빌딩 6, 7, 8층", 2, 22));
		dataset.add(new SampleData("로뎀요양병원", "인천 미추홀구 주안로 211", 2, 26));
		dataset.add(new SampleData("인천프라임요양원", "인천 부평구 영성중로 31", 1, 26));
		dataset.add(new SampleData("에쉐르카운티", "인천 미추홀구 주승로 110", 3, 26));
		dataset.add(new SampleData("유당마을실버타운", "기 수원시 장안구 수일로191번길 26", 3, 28));
		dataset.add(new SampleData("다나은요양병원", "경기 고양시 일산동구 고봉로 467-57 가동 지하1층~지상3층", 2, 27));
		dataset.add(new SampleData("보바스기념병원", "경기 성남시 분당구 대왕판교로 155-7", 2, 30));
		dataset.add(new SampleData("서울위례바이오요양병원", "경기 성남시 수정구 헌릉로 999 위례센트럴메디타운 2,3,4층", 2, 30));
		dataset.add(new SampleData("분당센트럴요양병원", "경기 성남시 분당구 양현로94번길 17", 2, 30));
		dataset.add(new SampleData("성남요양원", "경기 성남시 수정구 수정북로 90", 1, 30));
		dataset.add(new SampleData("자광원", "경기 성남시 수정구 가마절로 40", 1, 30));
		dataset.add(new SampleData("강동스마일요양병원", "경기 하남시 미사강변대로54번길 70", 2, 30));
		dataset.add(new SampleData("서울라이즈요양병원", "경기 구리시 검배로 37 동진스카이빌딩 6~10층", 2, 27));
		dataset.add(new SampleData("늘푸른요양원", "경기 안산시 단원구 와동1로 11", 1, 29));
		dataset.add(new SampleData("경희요양병원", "경기 안산시 단원구 광덕대로 162 창진타운 3층", 2, 29));
		dataset.add(new SampleData("현당의료재단 늘봄요양병원", "경기 용인시 수지구 포은대로59번길 17 늘봄요양병원", 2, 30));
		dataset.add(new SampleData("헤리티지 요양원", "경기 용인시 기흥구 지삼로107번길 48-1", 1, 30));
		dataset.add(new SampleData("레인보우빌리지 실버타운", "경기 용인시 기흥구 기흥로116번길 99", 3, 30));
		dataset.add(new SampleData("안양요양병원", "경기 안양시 만안구 안양로 335", 2, 29));
		dataset.add(new SampleData("근영실버타운", "경기 화성시 정남면 덕절중앙길 1-17", 3, 28));
		dataset.add(new SampleData("금천햇살요양원", "서울특별시 금천구 시흥대로 487", 1, 8));
		dataset.add(new SampleData("대한연세요양원", "서울특별시 강동구 고덕로 421", 1, 2));
		dataset.add(new SampleData("의료법인 미소들노인전문병원", "서울 구로구 고척로21나길 88-41", 2, 7));
		
		return dataset;
	}

}
