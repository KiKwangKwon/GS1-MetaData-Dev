# GS1-MetaData-Dev [개발]

- [GS1 Dev repository](#프로젝트-개요)
- [프로젝트 구성](#프로젝트-구성)
- [개발 환경](#개발-환경)
- [데이터 웨어하우스 구축 실습](#데이터-웨어하우스-구축-실습)
- [버전 관리](#버전-관리)

## 프로젝트 개요

<!--프로젝트 대문-->

대중교통 **데이터 수집 연계 체계 구축** 및 **대중교통 특성 분석** 수행을 위한 개발 저장소입니다.

이 문서는 프로젝트의 커버리지와 하위 폴더의 목적을 설명합니다.

워크플레이스 구조 및 목적

```
AI-compacting-regional-districts-project
├─dashboard # 대시보드 관련 소스 코드 및 리소스
├─data-warehouse # 데이터 웨어하우스 구축 및 관리
├─docs # 기타 자료
├─ml-algorithm # ML 학습 알고리즘 관련 코드
└─temp # 개인별 임시 폴더, Docusaurus 문서
```

### 프로세스

1. **데이터 수집**: 외부 데이터 수집
2. **데이터 웨어하우스 구축**: 데이터 수집, 변환, 저장을 위한 중앙 데이터 저장소 구축
3. **MLOps 시스템 구축**: 데이터 전처리, 모델 훈련, 평가, 배포를 위한 워크플로우 구현
4. **ML 모델 개발**: 대중교통 데이터 분석을 위한 ML모델 개발 및 최적화

### 도심융합특구 과제

! 본 **지역도심 융합 기술 연구개발** 과제의 상세 내용은 docusaurus(경로 추가 예정)을 참조해주세요.

**수행 과제 정의(2차년도)**<br>
본 연구개발 과제에서 수행해야 할 과업은 다음과 같습니다.

1. 울산 도시융합특구 활성화에 필요한 울산 도심의 현황과 이슈를 해결하기 위해 울산 대중교통과 관련된 공공기관 및 기업 등의 데이터 제공자로부터 수집한 방대한 데이터를 확보 및 연계하는 데이터 웨어하우스 구축
2. 다양한 AI 기반 이용현황 분석 알고리즘들을 개발하여 대중교통 최적 운영안을 산출 후 시뮬레이션을 통한 검증을 통해 대중교통 최적 운영 기반 시스템을 연구 및 개발

## 프로젝트 구성

프로젝트의 커버리지와 워크플로우 폴더별 개설 목적을 설명합니다.

### data

데이터 파이프라인을 수행의 이해를 돕기 위한 원시 데이터 및 데이터 레이크의 임시 보관함입니다. 연관된 샘플 데이터는 `data` 폴더 내에 저장하였습니다.

본 과제를 수행하기 위한 실제 데이터 저장소는 `dev-6`입니다.<br>
`dev-6` IP 주소: 172.30.1.222<br>
port 번호: `22`<br>
실제 데이터 저장 경로

- 원시 데이터: `/data/ai/chg/Raw_data`
- 데이터 레이크: `/data/ai/chg/data/delta`

**수집 데이터 개요**<br>
수집 데이터의 세부 사항은 [데이터-docusaurs](./temp/docusaurus/docs/데이터/data_intro.md)를 참고해주시길 바랍니다.

| 데이터 종류               | 데이터 출처     |
| ------------------------- | --------------- |
| 버스 통행 데이터          | 공공 데이터 API |
| C-ITS 실시간 데이터       | 공공 데이터 API |
| 차량 통행 데이터          | 공공 데이터 API |
| 날씨 및 공간정보 데이터   | 공공 데이터 API |
| 교통관리센터 데이터       | 교통관리센터 DB |
| 버스카드 사용 이력 데이터 | 교통관리센터 DB |
| 유동 인구 데이터          | 교통관리센터 DB |

### data-warehouse

구축한 데이터 ETL 파이프라인에 대한 저장소입니다. 폴더 내의 코드를 통해 데이터 파이프라인을 실행 할 수 있습니다.<br>

관련 수행 방법은 `data-warehouse` 폴더 내 README 파일과 [docusaurs](./temp/docusaurus/docs/데이터%20웨어하우스%20구축/MLOps%20구현/datapipeline-1cyclel.md)를 참고해주시길 바랍니다.

- `docusaurus` 튜토리얼의 내용을 참고하여 기구축된 데이터 파이프라인에 대한 과정을 1-cycle로 진행하실 수 있습니다
- README v0.3 기준으로 데이터 웨어하우스의 안정화가 미흡한 상황이라, 튜토리얼의 내용을 그대로 적용하실 경우 문제가 발생할 수 있습니다.

추후 MLOps 시스템이 갖춰질 경우 폴더를 병합할 예정입니다.

### eda

도심융합특구 대중교통 특성과 환경 특성을 분석한 자료의 저장소입니다.

### ml-algorithm

도심융합특구 사업에서 개발을 하게될 대중교통 기회 유발 산출 및 교통 혼잡도 산출 알고리즘의 개발 코드 저장소입니다.

## 개발 환경

주요 클러스터 셋업

|                  | version (dev) |
| ---------------- | ------------- |
| Platform         | AMD64         |
| Docker           | 25.0.2        |
| Python           | 3.10.12       |
| Ubuntu           | 20.04.3 LTS   |
| Apache Spark     | 3.1.2         |
| PostgreSQL(DB)   | 9.6           |
| delta-core(jdbc) | 2.12.0-1.0.0  |
| postgresql(jdbc) | 42.2.0        |
| MLFlow           | 1.21.0        |
| Flask            | 2.2.5         |
| Apache Kafka     | 2.13-2.6.0    |

---

|                 | version (pip) |
| --------------- | ------------- |
| superset        | 1.3.2         |
| confluent_kafka | 2.4.0         |
| pyspark         | 3.1.2         |
| dbt-postgres    | 1.1.0         |
| dbt-core        | 1.1.0         |
| dbt-spark       | 1.1.0         |

## 데이터 웨어하우스 구축 실습

해당 레포에 저장되어 있는 샘플 데이터를 통해 데이터 웨어하우스 구축 방법과 현황을 이해할 수 있습니다.

해당 실습은 [실습 수행](./data-warehouse/README.md)을 참고해주시길 바랍니다

## 버전 관리

v0.2
updated. 2024.06.05

v0.3
updated. 2024.06.27
