# refactoring-example
리팩토링 책(마틴 파울러 저)을 보면서 연습할 수 있도록 예제를 정리하는 저장소 입니다.

## Chapter 06 메서드 정리
- [메서드 추출](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter06/_01_extract_method)
- [메서드 내용 직접 삽입](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter06/_02_inline_method)
- [임시 변수 내용 직접 삽입](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter06/_03_inline_temp)
- [임시 변수를 메서드 호출로 전환](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter06/_04_inline_temp_with_query)
- [직관적 임시 변수 사용](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter06/_05_introduce_explaining_variable)
- [임시 변수 분리](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter06/_06_split_temporary_variable)
- [매개 변수로의 값 대입 제거](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter06/_07_remove_assignments_to_parameters)
- [메서드를 메서드 객체로 전환](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter06/_08_replace_method_with_method_object)
- [알고리즘 전환](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter06/_09_substitute_algorithm)

## Chapter 07 객체 간의 기능 이동
- [메서드 이동](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter07/_01_move_method)
- [필드 이동](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter07/_02_move_field)
- [클래스 추출](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter07/_03_extract_class)
- [클래스 내용 직접 삽입](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter07/_04_inline_class)
- [대리 객체 은폐](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter07/_05_hide_delegate/example)
- [과잉 중개 메서드 제거](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter07/_06_remove_middle_man)
- [외래 클래스에 메서드 추가](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter07/_07_introduce_foreign_method)
- [국소적 상속 확장 클래스 사용](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter07/_08_introduce_local_extension)

## Chapter 08 데이터 체계화
- [필드 자체 갭슐화](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter08/_01_self_encapsulated_field)
- [데이터 값을 객체로 전환](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter08/_02_replace_data_value_with_object)
- [값을 참조로 전환](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter08/_03_change_value_to_reference)
- [참조를 값으로 전환](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter08/_04_change_reference_to_value)
- [배열을 객체로 전환](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter08/_05_replace_array_with_object)
- [관측 데이터 복제](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter08/_06_duplicate_observed_data)
- [클래스의 단방향 연결을 양방향으로 전환](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter08/_07_change_unidirectional_association_to_bidirectional)
- [클래스의 양방향 연결을 단방향으로 전환](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter08/_08_change_bidirectional_associtaion_to_unidirectional)
- [마법 숫자 기호를 상수로 전환](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter08/_09_replace_magic_number_with_symbolic_constant)
- [필드 캡슐화](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter08/_10_encapsulate_field)
- [컬렉션 캡슐화](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter08/_11_eccapsulate_collection)
- [레코드를 데이터 클래스로 전환](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter08/_12_replace_record_with_data_class)
- [분률 부호를 클래스로 전환](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter08/_13_replace_type_code_with_class)
- [분류 부호를 하위 클래스로 전환](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter08/_14_replace_type_code_with_subclass)
- [분류 부호를 상태/전략 패턴으로 전환](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter08/_15_replace_type_code_with_state_strategy)
- [하위 클래스를 필드로 전환](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter08/_16_replace_subclass_with_fields)

## Chapter 09 조건문 간결화
- [조건문 쪼개기](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter09/_01_decompose_conditional)
- [중복 조건식 통합](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter09/_02_consolidate_conditional_expression)
- [조건문의 공통 실행 코드 꺼내기](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter09/_03_consolidate_duplicate_conditional_fragments)
- [제어플래그 제거](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter09/_04_remove_control_flag)
- [여러 겹의 조건문을 감시 절로 전환](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter09/_05_replace_nested_conditional_with_guard_clauses)
- [조건문을 재정의로 전환](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter09/_06_replace_conditional_with_polymorphism)
- [Null 검사를 널 객체에 위임](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter09/_07_introduce_null_object)

## Chapter 10 메서드 호출 단순화
- [메서드명 변경](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter10/_01_rename_method)
- [상태 변경 메서드와 값 반환 메서드를 분리](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter10/_04_separate_query_from_modifier)
- [메서드를 매개변수로 전환](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter10/_05_parameterize_method)
- [매개변수를 메서드로 전환](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter10/_06_replace_parameter_with_explicit_methods)
- [객체를 통채로 전달](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter10/_07_preserve_whole_object)
- [매개변수 세트를 메서드로 전환](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter10/_08_replace_parameter_with_method)
- [매개변수 세트를 객체로 전환](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter10/_09_introduce_parameter_object)
- [쓰기 메서드 제거](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter10/_10_remove_setting_method)
- [생성자를 팩토리 메서드로 전환](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter10/_12_replace_constructor_with_factory_method)
- [하향 타입 변환을 캡슐화](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter10/_13_encapsulate_downcast)
- [에러 부호를 예외 통지로 교체](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter10/_14_replace_error_code_with_exception)
- [예외 처리를 테스트로 교체](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter10/_15_replace_exception_with_test)

## Chapter 11 일반화 처리
- [필드 상향](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter11/_01_pull_up_field)
- [메서드 상향](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter11/_02_pull_up_method)
- [생성자 내용 상향](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter11/_03_pull_up_constructor_body)
- [하위클래스 추출](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter11/_06_extract_subclass)
- [상위클래스 추출](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter11/_07_extract_superclass)
- [인터페이스 추출](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter11/_08_extract_interface)
- [템플릿 메서드 형성](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter11/_10_form_template_method)
- [상속을 위임으로 전환](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter11/_11_replace_inheritance_with_delegation)
- [위임을 상속으로 전환](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter11/_12_replace_delegation_with_inheritance)

## Chapter 12 복합 리팩토링
- [상속 구조 정리](https://github.com/june0313/refactoring-example/tree/master/src/main/java/chapter12/_01_tease_apart_inheritance)
