生成渠道包: ./gradlew clean assembleReleaseChannels
支持 productFlavors: ./gradlew clean assembleMeituanReleaseChannels
生成单个渠道包: ./gradlew clean assembleReleaseChannels -PchannelList=meituan

生成多个渠道包: ./gradlew clean assembleReleaseChannels -PchannelList=meituan,dianping

写入渠道:java -jar walle-cli-all.jar batch -c meituan,meituan2,meituan3 /Users/walle/app/build/outputs/apk/app.apk
显示当前apk中的渠道和额外信息:java -jar walle-cli-all.jar show /Users/Meituan/app/build/outputs/apk/app.apk
