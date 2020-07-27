terraform {
    backend "s3" {
        bucket = "bucket-jenkins"
        key = "artemis/us-east-1/class/dev/infrastructure.tfstate"
        region = "us-east-1"
    }
}
