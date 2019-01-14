@echo on
call gradlew build
if "%ERRORLEVEL%" == "0" goto ok
echo.
echo GRADLEW BUILD has errors - breaking work
goto fail

:ok
git add *
git commit -m %1
git push origin master
goto end

:fail
echo.
echo There were errors

:end
echo.
echo Work is finished


