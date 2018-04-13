# Appium-with-Saucelabs-

1. create account in saucelabs for free trial.

2.Upload your apk using command

curl -u vishakha.inntocal:eae104f0-cc5d-434f-bb5c-655ca684b34b -X POST -H "Content-Type: application/octet-stream" https://saucelabs.com/rest/v1/storage/vishakha.inntocal/myswaasth.apk?overwrite=true --data-binary @/home/aj/Desktop/myswaasth.apk


3. now create your appium project and add the following desired capabilities.
