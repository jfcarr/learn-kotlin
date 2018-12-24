KOTLINCOMPILER = kotlinc
FORCEDELETE = -rm -f

default:
	@echo 'Usage:'
	@echo '  make <target>'
	@echo ''
	@echo 'Targets:'
	@echo '  run      Run the simpleclass application.'
	@echo '  build    Build the simpleclass application.'
	@echo '  clean    Remove objects and binaries.'

run: build
	@java -jar simpleclass.jar

build: simpleclass.jar

simpleclass.jar: simpleclass.kt
	$(KOTLINCOMPILER) simpleclass.kt -include-runtime -d simpleclass.jar

clean:
	$(FORCEDELETE) simpleclass.jar
