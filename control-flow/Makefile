KOTLINCOMPILER = kotlinc
FORCEDELETE = -rm -f

default:
	@echo 'Usage:'
	@echo '  make <target>'
	@echo ''
	@echo 'Targets:'
	@echo '  run-if     Run the if-expression application.'
	@echo '  run-when   Run the when application.'
	@echo '  build      Build all.'
	@echo '  clean      Remove objects and binaries.'

run-if: build
	@java -jar if-expression.jar

run-when: build
	@java -jar when.jar

build: if-expression.jar when.jar

if-expression.jar: if-expression.kt
	$(KOTLINCOMPILER) if-expression.kt -include-runtime -d if-expression.jar

when.jar: when.kt
	$(KOTLINCOMPILER) when.kt -include-runtime -d when.jar

clean:
	$(FORCEDELETE) if-expression.jar
	$(FORCEDELETE) when.jar
