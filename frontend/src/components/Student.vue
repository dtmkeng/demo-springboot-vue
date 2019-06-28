<template>
    <div>
        <li v-for="(std,type) in student" v-bind:key="type">
            {{ std.firstName }}----{{std.lastName}}
        </li>
    </div>
</template>

<script>
export default {
    name:'Student',
    props:{
        name:String
    },
    data(){
        return {
            student:[]
        }
    },
    mounted () {
        fetch('http://localhost:9000/api/student')
            .then(response => {
             return response.json();
        }).then(data =>{
             console.log(data)
             this.student=data;
        })
    }
}
</script>
 